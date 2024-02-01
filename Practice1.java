import java.util.*;
public class Practice1 {
    public static int CalcPower(int x,int n)
    {
        if( n == 0)
        {
            return 1;
        }
        if(x == 0)
        {
            return 0;
        }
        int xpownm1 = CalcPower(x, n-1);
        int xpown = x * xpownm1;
        return xpown; 
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int x = sc.nextInt();
        System.out.println("Enter Power Number : ");
        int n = sc.nextInt();

        int result = CalcPower(x, n);
        System.out.println(x+" raised to "+n+" is : "+result);
    }    
}
