import java.util.*;
public class FiboRecursion {
   
    public static void PrintFibo(int n1,int n2,int n)
    {
        if(n == 0)
        {
            return;
        }
        int n3 = n1 + n2;
        System.out.print(n3+" ");
        
        PrintFibo(n2,n3,n-1);

    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        int n1=0, n2=1;
        System.out.print(n1+" "+n2+" ");

        PrintFibo(n1, n2, n-2);
    }
    
}