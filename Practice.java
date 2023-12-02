import java.util.*;
public class Practice
{
    public static void TowerOfhanoi(int n,String src, String helper,String dest)
    {
        if(n == 1)
        {
            System.out.println("Transfer Disk "+n+ " from "+src+" to "+dest);
            return;
        }
        TowerOfhanoi(n-1, src, dest, helper);
        System.out.println("Transfer Disk "+n+ " from "+src+" to "+dest);
        TowerOfhanoi(n-1, helper, src, dest);
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Disks : ");
        int n = sc.nextInt();

        TowerOfhanoi(n,"S", "H","D");
    }
}