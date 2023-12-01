import java.util.*;
public class Recursion {
    public static void PrintNo(int n)
    {
        if(n >= 11)
        {
            return;
        }
        System.out.print(n+" ");
        PrintNo(n+1);
    }

    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();

        PrintNo(n);

    }    
}
