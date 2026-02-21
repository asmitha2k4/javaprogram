 import java.util.Scanner;
public class StudentFineSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentId, attempts;
        String name;
        int choice;
        int totalFine = 0;
        // Input basic details
        System.out.print("Enter Student ID: ");
        studentId = sc.nextInt();
        sc.nextLine(); // clear buffer
        System.out.print("Enter Student Name: ");
        name = sc.nextLine();
        System.out.print("Enter Number of Attempts: ");
        attempts = sc.nextInt();
        System.out.println("\n----- Fine Menu -----");
        do {
            System.out.println("\n1. Not wearing ID");
            System.out.println("2. Not wearing shoes");
            System.out.println("3. Casual leave taken");
            System.out.println("4. Not returning Library book");
            System.out.println("5. Breakage of Lab item");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    int fine1 = 150 * attempts;
                    totalFine += fine1;
                    System.out.println("Fine for not wearing ID: Rs " + fine1);
                    break;
                case 2:
                    int fine2 = 250 * attempts;
                    totalFine += fine2;
                    System.out.println("Fine for not wearing shoes: Rs " + fine2);
                    break;
                case 3:
                    int days;
                    System.out.print("Enter number of casual leave days (more than 5): ");
                    days = sc.nextInt();
                    int fine3 = days * 10;
                    totalFine += fine3;
                    System.out.println("Fine for casual leave: Rs " + fine3);
                    break;
                case 4:
                    int books, daysLate;
                    System.out.print("Enter number of books: ");
                    books = sc.nextInt();
                    System.out.print("Enter number of days delayed: ");
                    daysLate = sc.nextInt();
                    int fine4 = books * daysLate * 20;
                    totalFine += fine4;
                    System.out.println("Fine for library books: Rs " + fine4);
                    break;
                case 5:
                    int items;
                    System.out.print("Enter number of lab items broken: ");
                    items = sc.nextInt();
                    int fine5 = items * 10000;
                    totalFine += fine5;
                    System.out.println("Fine for lab breakage: Rs " + fine5);
                    break;
                case 6:
                    System.out.println("\nExiting menu...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 6);
        System.out.println("\n----- Student Fine Summary -----");
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + name);
        System.out.println("Total Fine   : Rs " + totalFine);
        if (totalFine > 50) {
            System.out.println("WARNING: Suspension warning generated!");
        }
        sc.close();
}}
