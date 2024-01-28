import java.util.*;
public class Practice{
    public static int Power(int x,int n)
    {
        double power = Math.pow(x, n);

        System.out.println("Power of X :"+power);
        return 1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No.: ");
        int x = sc.nextInt();
        System.out.println("Enter the power : ");
        int n = sc.nextInt();
        Power(x, n);
    }
}