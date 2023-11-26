import java.util.Scanner;

public class Practice
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A : ");
        int a = sc.nextInt();
        System.out.println("Enter B :");
        int b = sc.nextInt();
        
        int sum = a + b;
        System.out.println("Sum of A and B is : "+sum);

    }
}