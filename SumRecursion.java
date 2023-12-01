import java.util.*;
public class SumRecursion {
    public static void PrintSum(int i,int n,int sum)
    {
        if(i ==n+1)
        {
            System.out.println(sum);
            return;
        }
        sum = sum + i;
        PrintSum(i+1, n, sum);
    }

    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int i=1;
        int sum = 0;

        PrintSum(i, n, sum);

    }    
}
