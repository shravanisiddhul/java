import java.util.Scanner;
public class Exercise9 {
    
    public static void GCD(int n,int m)
    {
        int gcd = 1;
        for(int i=1; i<=n && i<=m; i++)
        {
            if(n%i == 0 && m%i == 0)
            {
                gcd = i;
            }  
        }
            System.out.printf("GCD of %d and %d is: %d", n, m, gcd);   
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First No : ");
        int n = sc.nextInt();
        System.out.println("Enter Second No : ");
        int m = sc.nextInt();

        GCD(n,m);
    }
}
