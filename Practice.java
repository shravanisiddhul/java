import java.util.*;
public class Practice
{
    public static void Average(int num1,int num2,int num3)
    {
        int avg = (num1+num2+num3)/3;
        System.out.println("Average : "+avg);
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        Average(num1,num2,num3);
    }
}