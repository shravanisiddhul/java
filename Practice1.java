import java.util.*;
public class Practice1
{
    
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.next();
        int Upper_count = 0;
        int Lower_count = 0;
        int digit_count = 0;

       int i = 0;
       while(i<str.length())
       {
        char ch = str.charAt(i);
        if(Character.isUpperCase(ch))
        {
            Upper_count++;
        }
        i++;
        if (Character.isLowerCase(ch)) {
            Lower_count++;
        }
        if(Character.isDigit(ch))
        {
            digit_count++;
        }
        
       }
       System.out.println("Uppercase :"+Upper_count);
       System.out.println("Lowercase :"+Lower_count);
       System.out.println("Digit Count : "+digit_count);
    }
}
        