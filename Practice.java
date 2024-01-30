import java.util.*;
public class Practice
{
    public static void PrintSum(int i,int n,int sum)
    {
        
        if(i == n)
        {
            sum =sum + i;
            System.out.println("Sum of "+n+" is : "+sum);
            return;
        }
        sum = sum + i;
        PrintSum(i+1,n,sum);
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;

        PrintSum(i, n, sum);
    }
}