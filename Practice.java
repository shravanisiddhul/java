import java.util.*;
public class Practice
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
    

        System.out.println("Enter a String : ");
        String str = sc.next();

        String result ="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == 'e')
            {
                result += 'i';
            }
            else if(str.charAt(i) == 'i')
            {
                result+= 'e';
            }            
            else{
                result += str.charAt(i);
            }
        }
        System.out.println("Result is "+result);
    }
}