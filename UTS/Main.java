import java.util.*;

// soal 1 selruh class 
class Department {
    private String name;
    //enkapsulasi pada class
    public Department(String name) {
        this.name = name;
    }
    //enkapsulasi pada class
    public String getDepartmentName() {
        return name;
    }
}

abstract class Employee {
    //enkapsulasi pada class
    protected String name;
    protected String jabatan;
    //agregasi
    protected Department department;
    protected int tahunMasuk;
    protected int jumlahAnak;


    public Employee(String name, String jabatan, Department department, int tahunMasuk, int jumlahAnak) {
        this.name = name;
        this.jabatan = jabatan;
        this.department = department;
        this.tahunMasuk = tahunMasuk;
        this.jumlahAnak = jumlahAnak;
    }

    public abstract int getSalary(int totalLembur, boolean akhirPekan);
}

//2. solusi multiple inheritance
class Fulltime extends Employee implements Koperasi {

    public Fulltime(String name, String jabatan, Department dept, int tahunMasuk, int jumlahAnak) {
        super(name, jabatan, dept, tahunMasuk, jumlahAnak);
    }
    //polymorphism
    @Override
    public int LoanMonthly() {
        return 500000;
    }

    private int getTunjanganJabatan() {
        int tahun = 2025 - tahunMasuk;
        if (tahun >= 3) {
            switch (jabatan) {
                case "Staf Manager": return 5000000;
                case "Staf Programmer": return 2000000;
                case "Staf Analis": return 3000000;
            }
        }
        return 0;
    }

    private int getGajiPokok() {
        int tahun = 2025 - tahunMasuk;
        if (jabatan.equals("Staf Manager")) {
            if (tahun <= 2) return 5000000;
            else if (tahun <= 5) return 6000000;
            else return 7000000;
        } else if (jabatan.equals("Staf Programmer")) {
            if (tahun <= 2) return 3000000;
            else if (tahun <= 5) return 4000000;
            else return 5000000;
        } else if (jabatan.equals("Staf Analis")) {
            if (tahun <= 2) return 3000000;
            else if (tahun <= 5) return 3500000;
            else return 4500000;
        }
        return 0;
    }
    //plymorphism
    @Override
    public int getSalary(int totalLembur, boolean akhirPekan) {
        int gajiPokok = getGajiPokok();
        int tunjJabatan = getTunjanganJabatan();
        int tunjAnak = jumlahAnak * 200000;
        int tunjKomunikasi = 500000;
        int tunjLembur = totalLembur * (akhirPekan ? 50000 : 20000);
        int tunjProduktivitas = (gajiPokok + tunjJabatan + tunjAnak + tunjKomunikasi + tunjLembur > 5000000) ? 500000 : 0;

        return gajiPokok + tunjJabatan + tunjAnak + tunjKomunikasi + tunjLembur + tunjProduktivitas;
    }
}

class Parttime extends Employee {

    public Parttime(String name, String jabatan, Department dept, int tahunMasuk, int jumlahAnak) {
        super(name, jabatan, dept, tahunMasuk, jumlahAnak);
    }

    //enkapsulasi pada class
    private int getGajiPokok() {
        if (jabatan.equals("Staf Programmer")) {
            return 4000000;
        }
        return 0;
    }
    //plymorphism
    @Override
    public int getSalary(int totalLembur, boolean akhirPekan) {
        int tunjLembur = totalLembur * (akhirPekan ? 50000 : 20000);
        int bonusProyek = 200000;

        return getGajiPokok() + tunjLembur + bonusProyek;
    }
}

public class Main {
    public static void main(String[] args) {
        Department dept = new Department("Teknik Informatika");


        Fulltime asep = new Fulltime("Asep", "Staf Programmer", dept, 2021, 2);
        Parttime ujang = new Parttime("Ujang", "Staf Programmer", dept, 2024, 0);

        int lemburAsep = 3 + 4;
        int gajiAsep = asep.getSalary(lemburAsep, true) - asep.LoanMonthly();

        int lemburUjang = 5 + 4;
        int gajiUjang = ujang.getSalary(lemburUjang, true);

        System.out.println("==== Slip Gaji Bulan Maret ====");
        System.out.println("Tanggal Terbit: 1 April 2025");
        System.out.println("Tanggal Pembayaran: 1 April 2025");

        System.out.println("\nNama: Asep");
        System.out.println("Jabatan: Staf Programmer");
        System.out.println("Total Pinjaman Koperasi: Rp" + asep.LoanMonthly());
        System.out.println("Total Gaji: Rp" + gajiAsep);

        System.out.println("\nNama: Ujang");
        System.out.println("Jabatan: Staf Programmer");
        System.out.println("Total Gaji: Rp" + gajiUjang);
    }
}

