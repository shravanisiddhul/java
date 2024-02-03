import java.util.*;
public class Recursion14 
{   
    // Friends pairing problem

    
    public static int guestCalls(int n)
    {
        if(n <= 1)
        {
            return 1;
        }
        // single
        int way1 = guestCalls( n-1);

        // pairing 
        int way2 = (n-1) * guestCalls(n-2);

        return way1 + way2;
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of guest : ");
        int n = sc.nextInt();

        System.out.println(" Number of ways the guest will come are : "+guestCalls(n));

    } 
  
}
