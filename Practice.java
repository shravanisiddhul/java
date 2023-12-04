import java.util.*;
public class Practice
{
    public static void ReverseString(String str,int i)
    {
        if (i == 0 ) 
        {
            System.out.println(str.charAt(i));
            return;
        }

        System.out.print(str.charAt(i));
        ReverseString(str, i-1);

    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.next();

        ReverseString(str, str.length()-1);

    }
}