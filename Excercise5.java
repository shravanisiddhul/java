import java.util.Scanner;
public class Excercise5 {
    public static void checkEligible(int n)
    {
        if(n<=0)
        {
            System.out.println("Invalid Input");
        }else if(n>18)
        {
            System.out.println("Eligible");
        }
        else
        {
            System.out.println("Not Eligible ");
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age : ");
        int n = sc.nextInt();

            checkEligible(n);
    }
}


