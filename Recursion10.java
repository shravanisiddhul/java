import java.util.*;
public class Recursion10
{
    public static String[] keypad = {".","abc","def","ghi","jKl","mno","pqrs","tu","vwx","yz"};

    public static void PrintComb(String str,int i,String Combination)
    {
        if(i == str.length())
        {
            System.out.println(Combination);
            return;
        }
        char CurrChar = str.charAt(i);
        String mapping = keypad[CurrChar - '0'];

        for(int idx=0; idx<mapping.length(); idx++)
        {
            PrintComb(str, i+1, Combination+mapping.charAt(idx));
        }
    }

     public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String (from 0 to 9 ): ");
        String str = sc.next();

        PrintComb(str, 0, " ");
    }
}