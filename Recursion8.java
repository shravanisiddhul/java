import java.util.*;
public class Recursion8
{
    public static void sequences(String str,int i,String newString )
    {
        if(i == str.length())
        {
            System.out.println(newString);
            return;
        }
        char CurrChar = str.charAt(i);
        
        //to be
        sequences(str, i+1, newString+CurrChar);

        // to not to be
        sequences(str, i+1, newString);
    }
public static void main(String args [])
{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String : ");
    String str = sc.next();

    sequences(str, 0, " ");
}
}