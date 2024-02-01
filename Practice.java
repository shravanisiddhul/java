import java.util.*;
public class Practice{
    public static  void StringRev(String str,int i)
    {
        if(i == 0)
        {
            System.out.print(str.charAt(i));
            return;
        }
        System.out.print(str.charAt(i));
        StringRev(str, i-1);
        // System.out.println(str);
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.next();
        
        StringRev(str,str.length()-1);
    }
}