import java.util.*;
public class String_problem2
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();

        String result = "";

        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == 'e')
            {
                result = result +'i';
                // result = result +'e';
            }
            else if(str.charAt(i) == 'i')
            {
                result = result +'e';
                // result =result + str.charAt(i);
            }
            else{
                result = result+str.charAt(i);
            }
        }
        System.out.println("Result is : "+result);
    }
}