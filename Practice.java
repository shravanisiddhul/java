import java.util.*;
public class Practice{
    public static void StrReverse(String str,int i)
    {
        if(i == 0)
        {
            System.out.print(str.charAt(i));
            return;
        }
        System.out.print(str.charAt(i));
        StrReverse(str, i-1);
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.next();

        StrReverse(str,str.length()-1);
    }
}