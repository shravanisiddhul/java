import java.util.*;
public class Practice
{ 
    
    public static int first = -1;
    public static int last = -1;
    public static void Occurence(String str,int i,char ch)
    {
        if(i == str.length())
        {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        if(str.charAt(i) == ch)
        {
            if(first == -1)
            {
                first = i;
            }
            else
            {
                last = i;
            }
        }
        Occurence(str, i+1, ch);
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.next();
        System.out.println("Enter element to be searched : ");
        char ch = sc.next().charAt(0);

        Occurence(str, 0, ch);
    }
}