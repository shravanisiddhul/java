import java.util.*;
public class Recusion4 {
    public static int first = -1;
    public static int last = -1;
    public static void FindOccurrence(String str,char ch,int i)
    {
        if(i == str.length())
        {
            System.out.println("First time occured at : "+first);
            System.out.println("Last Time occured at : "+last);
            return;
        }
        if(str.charAt(i) == ch)
        {
            if(first == -1)
            {
                first = i;
            }
            else{
                last = i;
            }
        }
        FindOccurrence(str, ch, i+1);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.next();
        System.out.println("Enter a element you want to search : ");
        char ch = sc.next().charAt(0);
        
        FindOccurrence(str, ch, 0);

    }    
}
