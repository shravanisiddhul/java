import java.util.*;
public class PowerRecursion{

    public static int CalPower(int x,int n){
        if(n == 0){
        return 1;
        }
        if( x == 0){
        return 0;
        }
        int powerMinus1 = (int) Math.pow(x, n-1);
        int power = x * powerMinus1;
        return power;

    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X :");
        int x = sc.nextInt();
        System.out.println("ENter n :");
        int n = sc.nextInt();

        int ans = CalPower(x,n);
        System.out.println(ans);
    }
}
