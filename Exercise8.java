import java.util.Scanner;
public class Exercise8 {
    public static void checkNo(int n)
    {
        if(n==0)
        {
            System.out.println("Zero");
        }
        else if(n>0)
        {
            System.out.println("Positive");
        }
        else
        {
            System.out.println("Negative");
        }
    } 
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No : ");
        int n = sc.nextInt();

        checkNo(n);
    }   
}
