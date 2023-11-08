import java.util.Scanner;
public class Problem14 {
    public static void  checkEven(int n)
    {
        if(n % 2 == 0)
        {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();

        checkEven(n);

    }
}
