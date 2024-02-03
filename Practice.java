import java.util.*;

public class Practice
{
    public static String [] keypad ={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    
    public static void PrintComb(String str,int i,String Combination)
    {
        if(i == str.length())
        {
            System.out.println(Combination);
            return;
        }
       
        char CurrChar = str.charAt(i);
        String mapping = keypad[CurrChar-'0'];

        for(int idx =0 ; idx<mapping.length(); idx++)
        {
            PrintComb(str, i+1, Combination+mapping.charAt(idx));
        }
    }
    
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String (from 0 to 9): ");
        String str = sc.next();
        HashSet<String> set = new HashSet<>(); 
        PrintComb(str, 0, " ");
    }
}