import java.util.*;
public class Practice{
    public static void Fibo(int n,int n1,int n2)
    {
        for(int i=2;i<n;i++)
        {
            int n3 = n1 + n2;
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
        }

    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no : ");
        int n = sc.nextInt();

        int n1 = 0;
        int n2 = 1;
        System.out.print(n1+" "+n2);
        Fibo(n, n1, n2);
    }
}