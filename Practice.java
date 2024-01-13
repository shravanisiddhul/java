import java.util.*;
public class Practice
{
    public static void SumOfOdd(int num,int sum)
    {
        for(int i=1; i<num; i++)
        {
            System.err.println(i);
            sum = sum + i; 
        }
        System.out.println("Sum : "+sum);

    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int sum =0;
        SumOfOdd(num,sum);
    }
}