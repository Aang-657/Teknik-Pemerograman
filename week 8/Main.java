import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose type of score:");
        System.out.println("1. Integer (example: 95)");
        System.out.println("2. String (example: A, B+)");
        System.out.print("Choice: ");
        int typeChoice = getValidInt(scanner);

        if (typeChoice == 1) {
            runProgramInteger(scanner);
        } else if (typeChoice == 2) {
            runProgramString(scanner);
        } else {
            System.out.println("Invalid choice. Exiting.");
        }

        scanner.close();
    }

    private static void runProgramInteger(Scanner scanner) {
        MyArrayList<Student<Integer>> students = new MyArrayList<>();
        boolean running = true;

        while (running) {
            displayMenu();
            System.out.print("Choose an option: ");
            int choice = getValidInt(scanner);

            switch (choice) {
                case 1:
                    System.out.print("Enter student's name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student's score (integer): ");
                    int score = getValidInt(scanner);
                    students.add(new Student<>(name, score));
                    break;
                case 2:
                    System.out.println("Student List:");
                    students.display();
                    System.out.println("Total students: " + students.size());
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter index to delete: ");
                    int index = getValidInt(scanner);
                    students.remove(index);
                    break;
                case 4:
                    System.out.print("Enter name: ");
                    String exName = scanner.nextLine();
                    System.out.print("Enter score (integer): ");
                    int exScore = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter home university: ");
                    String university = scanner.nextLine();
                    ExchangeStudent<Integer> exchangeStudent = new ExchangeStudent<>(exName, exScore, university);
                    students.add(exchangeStudent);
                    break;
                case 5:
                    System.out.println("Thank you for using the program!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.\n");
            }
        }
    }

    private static void runProgramString(Scanner scanner) {
        MyArrayList<Student<String>> students = new MyArrayList<>();
        boolean running = true;

        while (running) {
            displayMenu();
            System.out.print("Choose an option: ");
            int choice = getValidInt(scanner);

            switch (choice) {
                case 1:
                    System.out.print("Enter student's name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student's score (e.g., A, B+): ");
                    String score = scanner.nextLine();
                    students.add(new Student<>(name, score));
                    break;
                case 2:
                    System.out.println("Student List:");
                    students.display();
                    System.out.println("Total students: " + students.size());
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter index to delete: ");
                    int index = getValidInt(scanner);
                    students.remove(index);
                    break;
                case 4:
                    System.out.print("Enter name: ");
                    String exName = scanner.nextLine();
                    System.out.print("Enter score score (e.g., A, B+): ");
                    String exScore = scanner.nextLine();
                    scanner.nextLine(); // consume newline
                    System.out.print("Enter home university: ");
                    String university = scanner.nextLine();
                    ExchangeStudent<String> exchangeStudent = new ExchangeStudent<>(exName, exScore, university);
                    students.add(exchangeStudent);
                    break;
                case 5:
                    System.out.println("Thank you for using the program!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.\n");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n===== Student Manager =====");
        System.out.println("1. Add Student");
        System.out.println("2. Display Students");
        System.out.println("3. Delete Student");
        System.out.println("4. Add Exchange Student");
        System.out.println("5. Exit");
    }

    private static int getValidInt(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Enter a number: ");
            scanner.next();
        }
        int num = scanner.nextInt();
        scanner.nextLine(); // consume newline
        return num;
    }
}
