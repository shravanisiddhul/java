import java.util.Scanner;

public class Practice
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A : ");
        int a = sc.nextInt();
        
        if(a % 2 == 0)
        {
            System.out.println("Number is Even ");
        }
        else{
            System.out.println("Number is Odd ");
        }


    }
}