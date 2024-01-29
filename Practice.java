import java.util.*;
public class Practice
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
    

        System.out.println("Enter an Email : ");
        String str = sc.next();

        String result ="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == '@')
            {
                break;
            }
            // else if(str.charAt(i) == 'i')
            // {
            //     result+= 'e';
            // }            
            else{
                result += str.charAt(i);
            }
        }
        System.out.println("Result is : "+result);
    }
}