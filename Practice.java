import java.util.Scanner;

public class Practice
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows :");
        int n = sc.nextInt();
        
        for(int i=n; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                if((i+j) % 2 == 0 ){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
               
            }
            System.out.println();
        }
    }
}