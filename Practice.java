import java.util.*;
public class Practice
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number of Rows :");
        int n = sc.nextInt();
        // System.out.println("Enter no. of columns :");
        // int m = sc.nextInt();
         for(int i=1; i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}