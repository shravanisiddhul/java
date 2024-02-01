import java.util.*;
public class Practice{
    public static int first =-1;
    public static int last =-1;
    public static  void Occurences(String str,int i,char ch)
    {
        if(i == str.length())
        {
            System.out.println("First Occurence of "+ch+" at : "+first);
            System.out.println("Last Occurence of "+ch+" at : "+last);
            return;
        }
        // char currentChar = str.charAt(i);
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
        Occurences(str, i+1,ch);
    }
    
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.next();
        System.out.println("Enter element to be searched");
        char ch = sc.next().charAt(0);
        
        Occurences(str, 0,ch);
    }
}