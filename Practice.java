[8:34 PM] Jay Prakash
import java.util.Scanner;
 
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");

        String input = scanner.nextLine();

        int count = 0;

        int i = 0;

        while (i < input.length()) {

            char ch = input.charAt(i);

            if (Character.isUpperCase(ch)) {

                count++;

            }

            i++;

        }

        System.out.println("Number of uppercase letters in the string: " + count);

    }

}

[8:34 PM] khushboo Singh 
Counting uppercase and lowercase letters 
[8:35 PM] divya sree (Guest)
import java.util.Scanner;
 
public class Raghu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");

        String input = scanner.nextLine();

        int count = 0;

        int i = 0; 

        while (i < input.length()) {

            char ch = input.charAt(i);

            if (Character.isUpperCase(ch)) {

                count++; 

            }

            i++;

        }

        System.out.println("Number of uppercase letters: " + count);

        scanner.close();

    }

}