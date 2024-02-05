import java.util.*;
public class Practice
{
    public static int guestCalls(int n)
    {
        if(n <= 1)
        { 
            return 1;
        }
        // single
        int way1 = guestCalls(n-1);

        // pair
        int way2 =(n-1) * guestCalls(n-2);

        return way1 + way2;
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of guests : ");
        int n = sc.nextInt();

        System.out.println(guestCalls(n));
    }
}