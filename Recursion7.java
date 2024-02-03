import java.util.*;
public class Recursion7
{
    public static boolean[] map = new boolean [26];

    public static void RemoveDuplicates(String str,int i,String newString)
    {
        if(i == str.length())
        {
            System.out.println("NewString is : "+newString);
            return;
        }
        char CurrChar = str.charAt(i);
        if(map[CurrChar - 'a'])
        {
            RemoveDuplicates(str, i+1, newString);
        }else{
            newString += CurrChar;
            map[CurrChar -'a'] = true;
            RemoveDuplicates(str, i+1, newString);

        }
    }

    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.next();

        RemoveDuplicates(str, 0, " ");
    }
}