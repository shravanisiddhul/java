import java.util.*;

public class PowerRecursion2 {
    public static int CalPower(int x,int n){
        if(n == 0){
        return 1;
        }
        if( x == 0){
        return 0;
        }
        // check if power is even or off
        if(n % 2 == 0)
        {
            return CalPower(x, n/2) * CalPower(x, n/2);
        }
        else
        {
            return CalPower(x, n/2) * CalPower(x, n/2) * x;
        }

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
