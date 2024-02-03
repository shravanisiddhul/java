import java.util.*;
import java.util.HashSet;
public class Recursion9 {
    public static void sequences(String str,int i,String newString ,HashSet<String> set)
    {
        if(i == str.length())
        {
            if(set.contains(newString))
            {
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char CurrChar = str.charAt(i);
        //  to be 
        sequences(str, i+1, newString+CurrChar, set);

        // not to be
        sequences(str, i+1, newString, set);
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.next();
        HashSet<String> set = new HashSet<>();

        sequences(str, 0, " ", set);
    }
}
