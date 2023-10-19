import java.util.Scanner;

public class Factorial1 {
    public static void main(String[] args)
    {
        int i,fact=1;
        Scanner sc = new Scanner(System.in);
       
        //System.out.println("Enter No : ");
        //double n = sc.next();
        System.out.print("Enter No : ");
        int n = sc.nextInt();
        for(i=1;i<=n;i++)
        {
            fact = fact*i;
        }
        System.out.println("Factorial of "+ n +" : "+ fact);
    }
    
}
