import java.util.*;
public class Recursion3 {
    public static void StringReverse(String str,int i)
    {
        if(i == 0)
        {
            System.out.print(str.charAt(i));
            return;
        }
        System.out.print(str.charAt(i));
        StringReverse(str, i-1);
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String : ");
        String str = sc.next();

        StringReverse(str,str.length()-1);
    }    
}
