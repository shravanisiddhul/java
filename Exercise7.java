import java.util.Scanner;
import java.util.*;
public class Exercise7
{
    public static void calculatePower(int n,int x)
    {
        System.out.println(Math.pow(n, x));
        return;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No : ");
        int n = sc.nextInt();
        System.out.println("Power no : ");
        int x = sc.nextInt();

        calculatePower(n, x);

    }
}