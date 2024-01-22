import java.util.*;
public class Practice {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of rows :");
        int n = sc.nextInt();
        System.out.println("Enter no.of Columns :");
        int m=sc.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==0||i==n-1||j==0||j==m-1)
                {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

