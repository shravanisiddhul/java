import java.util.*;
public class Recursion11
{
    public static void PrintPermutation(String str,String Permutation)
    {
        // Permutation of String
        if(str.length() == 0)
        {
            System.out.println(Permutation);
            return;
        }
        for(int i=0;i<str.length();i++)
        {
            char CurrChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1);
            PrintPermutation(newString, Permutation+CurrChar);
        }
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.next();

        PrintPermutation(str, " ");
    }
}