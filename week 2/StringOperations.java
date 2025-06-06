import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca input string
        String A = scanner.nextLine();
        String B = scanner.nextLine();

        // 1. Menghitung total panjang
        int totalLength = A.length() + B.length();
        System.out.println(totalLength);

        // 2. Perbandingan leksikografis
        if (A.compareTo(B) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // 3. Kapitalisasi huruf pertama
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(capitalizedA + " " + capitalizedB);

        scanner.close();
    }
}
