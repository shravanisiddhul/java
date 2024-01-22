import java.util.*;
public class Practice {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of rows :");
        int n = sc.nextInt();
        int num = 1;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if((i+j) % 2 ==0)
                {
                    System.out.print("1"+" ");
                }
                else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();
        }
       
    }
}

