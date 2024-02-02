import java.util.*;
public class Practice1
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.next();
        int count = 0;

       int i = 0;
       while(i<str.length())
       {
        if(str.charAt(i)=='a'|| str.charAt(i)== 'e'|| str.charAt(i)=='o'||str.charAt(i)=='u')
        {
            count++;
        }
        i++;
        
       }
       System.out.println(count);
    }
}
        