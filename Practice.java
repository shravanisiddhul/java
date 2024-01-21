import java.util.*;
public class Practice
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a No. : ");
        int n = sc.nextInt();

        System.out.println("Table of "+n+" is :");
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}