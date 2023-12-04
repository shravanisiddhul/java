import java.util.*;
public class Practice
{
    public static int first = -1;
    public static int last = -1;
    if(i == str.length())
    {
        System.out.println("First time found at : "+first);
        System.out.println("Last Time found at : "+last);
        return;
    }

    public static void FindOccurence(String str,char ch,int i)
    {
        if(str.length() == ch)
        {
            if (first == -1) 
            {
                first = i;
            }
            else{
                last = i;
            }
        }
        FindOccurence(str, ch, i+1);
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a String : ");
        String str = sc.next();
        System.out.println("Enter a character that u want ti=o search : ");
        char ch = sc.next().charAt(0);
    
        Practice.FindOccurence(str, ch,0);
    
}