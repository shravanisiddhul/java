import java.util.*;
public class Practice{
    public static void multiply(int a,int b)
    {
        int mul = a * b;
        System.out.println("Multiplication of "+a+" and "+b+ " is : "+mul);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a :");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();

        multiply(a,b);
    }
}