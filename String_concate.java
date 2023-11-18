import java.util.*;
public class String_concate {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First name : ");
        String firstname = sc.next();
        System.out.println("Enter Last Name : ");
        String lastname = sc.next();

        //concatenation
        String fullname = firstname +" "+"V"+" "+lastname;
        System.out.println("Fullname is : "+fullname);

        //Calculating length
        System.out.println(fullname.length());
        System.out.println();

        //Printing characters one by one
        System.out.println("Characters of String are : ");

        for(int i=0;i<fullname.length(); i++)
        {
            System.out.println(fullname.charAt(i));
        }
        System.out.println();

        //Compare
        if(firstname.compareTo(lastname)== 0)
        {
            System.out.println("Strings are Equal ");
        }
        else
        {
            System.out.println("Strings are not Equal ");
        }
        //substring
        String name = fullname.substring(4,5);
        System.out.println(name);
    }
}
