import java.util.*;
public class Practice1
{
    public static boolean string(String str)
    {
        char a = str.charAt(0);
        if(a == 'a' || a == 'e' || a == 'i' || a =='o' || a == 'u'|| a == 'A' || a== 'E' || a == 'I'|| a=='O' ||a == 'U')
            
        return true;
        return false;
        
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.next();

        System.out.println(string(str));

    }
}