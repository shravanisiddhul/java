import java.util.*;
public class Practice{
    public static void Average(int a,int b,int c )
    {
        float average = (a+b+c)/3;
        System.out.println("Average of 3 Numbers are :"+average);
        return;
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 No :");
        System.out.println("Enter A :");
        int a = sc.nextInt();
        System.out.println("Enter B : ");
        int b = sc.nextInt();
        System.out.println("Enter C :");
        int c = sc.nextInt();

        Average(a, b, c);
    }
}