import java.util.*;
public class String_probem3 {
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Email : ");
        String email = sc.nextLine();

        String username = "";

        for(int i=0; i<email.length(); i++)
        {
            if(email.charAt(i)=='@')
            {
                break;
            }
            else{
                username = username + email.charAt(i);
            }
        }
        System.out.println("Username is : "+username);
    }

}
