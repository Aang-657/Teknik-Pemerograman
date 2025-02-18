import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Jumlah test case
        scanner.nextLine(); // Membersihkan buffer newline

        for (int i = 0; i < t; i++) {
            String input = scanner.nextLine(); // Membaca input sebagai string
            
            try {
                long n = Long.parseLong(input); // Coba ubah ke long
                System.out.println(n + " can be fitted in:");
                
                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                    System.out.println("* long");
                }
            } catch (NumberFormatException e) {
                // Jika tidak dapat dikonversi ke long
                System.out.println(input + " can't be fitted anywhere.");
            }
        }
        scanner.close();
    }
}
