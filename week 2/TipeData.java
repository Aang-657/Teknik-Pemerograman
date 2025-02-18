import java.util.Scanner;

public class TipeData{
    public static void main (String[]args){
        System.out.println("byte: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan jumlah test case yang akan di:");
        int t = scanner.nextInt();
        scanner.nextLine();
        System.out.println("masukkan angka:");
        for (int i = 0; i < t; i++){
            String input = scanner.nextLine();
            try{
                long n = Long.parseLong(input);
                System.out.println(n+ " can be fitted in:");
                if(n>=Byte.MIN_VALUE && n<=Byte.MAX_VALUE){
                    System.out.println("*Byte");
                }
                if(n>=Short.MIN_VALUE && n<=Short.MAX_VALUE){
                    System.out.println("*Short");
                }
                if(n>=Integer.MIN_VALUE && n<=Integer.MAX_VALUE){
                    System.out.println("*Integer");
                }
                if(n>=Long.MIN_VALUE && n<=Long.MAX_VALUE){
                    System.out.println("*Long");
                }
            }catch(NumberFormatException e){
                System.out.println(scanner.next() + " can't be fitted anywhere");
            }
        }
        scanner.close();
    }
}
