import java.util.*;
public class Practice {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of rows :");
        int n = sc.nextInt();
       
        for(int i=n;i>=1;i--)
        {
            for(int j=n;j>n-i;j--)
            {
               System.out.print("*");
            }
            System.out.println();
        }
    }
}

