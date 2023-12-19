import java.util.*;
public class Recursion5
{
    public static void PassAllX(String str, int i,int count,char ch,String newString)
    {
        if(i == str.length())
        {
            for(int idx=0;idx<count; idx++)
            {
                newString += ch;
            }
            // PassAllX(str, i+1, count, ch, newString);
            System.out.println(newString);
            return;

        }
        char currentCh = str.charAt(i);
        if(str.charAt(i) == ch)
        {
            count++;
            PassAllX(str, i+1, count, ch, newString);
        }
        else{
            newString += currentCh;
            PassAllX(str, i+1, count, ch, newString);
            // System.out.println(newString);
        }
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        int count = 0;
        String newString = "";
        System.out.println("Enter character to be moved : ");
        char ch = sc.next().charAt(0);

        PassAllX(str, 0, 0, ch, newString);
    }
}