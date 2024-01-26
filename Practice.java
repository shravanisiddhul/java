import java.util.*;
public class Practice
{
    public static void Table(int n) 
    {
       for(int i=1;i<=10;i++)
       {
            System.out.println(n+" * "+i+" = "+n*i);
       }   
    }

    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();

        Table(n);
    }
}