import java.util.*;
public class Practice1
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.next();
        int count = 0;

       for(int  i=0;i<str.length();i++)
       {
        if(str.charAt(i) == 'a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'||str.charAt(i)=='u')
        {
            count++;
        }
        // System.out.println(count);
       }
       System.out.println(count);
    }    
}
