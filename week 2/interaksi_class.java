import java.util.Scanner;

// Customer.java
class Customer {
    // Ini adalah atribut yang menyimpan nama pelanggan.
    private String name;
    // Ini adalah atribut yang menyimpan saldo pelanggan.
    private double balance;

    // Ini adalah konstruktor yang menerima argumen 'name' dan 'balance' untuk menginisialisasi objek Customer.
    public Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    // Ini adalah metode dalam Customer yang mengirim pesan ke objek ATM untuk melakukan penarikan uang.
    // Dependences (use-a): Customer menggunakan ATM untuk melakukan transaksi.
    public void withdraw(ATM atm, double amount) {
        atm.withdrawMoney(this, amount);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

// ATM.java
class ATM {
    // Ini adalah metode dalam ATM yang menangani proses penarikan uang berdasarkan saldo pelanggan.
    // Dependences (use-a): ATM menggunakan objek Customer untuk memeriksa saldo dan memperbaruinya.
    public void withdrawMoney(Customer customer, double amount) {
        // Ini adalah perilaku (behaviour) dari ATM yang mengecek apakah saldo pelanggan mencukupi sebelum melakukan transaksi.
        if (customer.getBalance() >= amount) {
            customer.setBalance(customer.getBalance() - amount);
            System.out.println(customer.getName() + " berhasil menarik Rp " + amount);
            System.out.println("Sisa saldo: Rp " + customer.getBalance());
        } else {
            System.out.println("Saldo tidak mencukupi untuk melakukan transaksi!");
        }
    }
}

// Main.java
public class interaksi_class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input pengguna untuk nama dan saldo awal
        System.out.print("Masukkan nama pelanggan: ");
        String name = scanner.nextLine();

        System.out.print("Masukkan saldo awal: Rp ");
        double balance = scanner.nextDouble();

        Customer customer1 = new Customer(name, balance);
        ATM atm1 = new ATM();

        System.out.println("Saldo awal: Rp " + customer1.getBalance());
        
        System.out.print("Masukkan jumlah yang ingin ditarik: Rp ");
        double amount = scanner.nextDouble();
        
        // Ini adalah pesan yang dikirim oleh objek Customer ke objek ATM untuk melakukan transaksi penarikan.
        // Dependences (use-a): Objek customer1 menggunakan objek atm1 untuk menarik uang.
        customer1.withdraw(atm1, amount);
        
        scanner.close();
    }
}
