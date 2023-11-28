import java.util.*;
public class UpdateSet {
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select operations :");
        System.out.println("1.Set operation ");
        System.out.println("2.Clear operation");
        System.out.println("Enter 1 or 2 : ");
        int oper = sc.nextInt();

        int n = 5;
        int pos = 2;
        int BitMask = 1 << pos;
        if (oper == 1)
        {
            //set
            int newNumber = (BitMask | n);
            System.out.println("New Number : "+newNumber);
        }else
        {
            //clear
            int newNumber = (~BitMask & n);
            System.out.println("New Number : " +newNumber);
        }
    }    
}
