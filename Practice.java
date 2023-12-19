import java.util.*;
public class Practice
{
    public static void MoveAllX(String str, int i, int count,char ch,String newString)
    {
        if(i == str.length())
        {
            for(int idx=0; idx < count; idx++)
            {
                newString += ch;
            }
            System.out.println("NewString : "+newString);
            return;
        }
        char currentCh = str.charAt(i);
        if(str.charAt(i) == ch)
        {
            count++;
            MoveAllX(str, i+1, count, ch, newString);
        }
        else{
            newString += currentCh;
            MoveAllX(str, i+1, count, ch, newString);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        System.out.println("Enter character to be moved : ");
        char ch = sc.next().charAt(0);
        String newString = "";

        MoveAllX(str, 0, 0, ch, newString);

    }
}