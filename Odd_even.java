import java.util.Scanner;
public class Odd_even 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        if(n%2==0)
        {
            System.out.println("No is Even ");
        }
        else
        {
            System.out.println("No is Odd ");
        }
    }    

}
