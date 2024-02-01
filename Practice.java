import java.util.*;
public class Practice{
    public static void TowerOfHanoi(int n,String src, String helper,String dest)
    {
        if( n == 1)
        {
            System.out.println("Transfer desk "+n+ " from "+src +" to "+dest);
            return;
        }
        TowerOfHanoi(n-1, src, dest, helper);
        System.out.println("Transfer desk "+n+ " from "+src +" to "+dest);
        TowerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Rings : ");
        int n = sc.nextInt();
        
        TowerOfHanoi(n, "S", "H", "D");
    }
}