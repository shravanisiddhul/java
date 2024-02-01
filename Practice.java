import java.util.*;
public class Practice
{
    public static void MoveX(String str,int i,int count,String newString)
    {
        if(i == str.length())
        {
            for(int idx=0;idx<count;idx++)
            {
                newString +='x';
            }
            System.out.println(newString);
            return;
        }
        if(str.charAt(i) == 'x')
        {
            count++;
            MoveX(str, i+1, count, newString);
        }
        else{
            newString += str.charAt(i);
            MoveX(str, i+1, count, newString);
        }
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.next();

        MoveX(str, 0, 0, " ");

    }
}