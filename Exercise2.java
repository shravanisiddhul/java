import java.util.Scanner;
public class Exercise2 {
    public static void sumOfOdd(int n)
    {
        int sum = 0;
        for(int i=1; i<=n; i=i+2)
        {
            System.out.println(i);
            sum = sum + i;
        }
        System.out.println("Sum of Odd Numbers is "+sum);
        return;
    }  

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        sumOfOdd(n);  
    }
}
