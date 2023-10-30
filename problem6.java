public import java.util.Scanner;

public class problem6{
    public static void evaluateMarks(int marks) {
        if (marks >= 90) {
            System.out.println("This is Good");
        } else if (marks >= 60 && marks <= 89) {
            System.out.println("This is also Good");
        } else if (marks >= 0 && marks <= 59) {
            System.out.println("This is Good as well");
        } else {
            System.out.println("Invalid marks entered");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 1;

        while (choice != 0) {
            System.out.println("\nMenu:");
            System.out.println("1. Enter student's marks");
            System.out.println("0. Exit");
            System.out.print("Enter your choice (1 or 0): ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter student's marks (out of 100): ");
                int marks = scanner.nextInt();
                evaluateMarks(marks);
            } else if (choice == 0) {
                System.out.println("Exiting the program");
            } else {
                System.out.println("Invalid choice. Please enter 1 or 0.");
            }
        }

        scanner.close();
    }
}

