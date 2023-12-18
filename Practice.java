import java.util.*;
public class Practice{
    public static int first = -1;
    public static int last = -1;

    public static void CountOccurrence(String str,char ch,int i)
    {
        if(i == str.length())
        {
            System.out.println("First occured at : "+first);
            System.out.println("Last occured at : "+last);
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
        CountOccurrence(str, ch, i+1);
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        System.out.println("Enter Element to be Searched : ");
        char ch = sc.next().charAt(0);

        CountOccurrence(str, ch,0);

    }
}