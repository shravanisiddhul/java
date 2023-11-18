import java.util.*;
public class String_concate {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First name : ");
        String firstname = sc.next();
        System.out.println("Enter Last Name : ");
        String lastname = sc.next();

        String fullname = firstname +" "+ lastname;
        System.out.println("Fullname is : "+fullname);
        System.out.println(fullname.length());
    }
}
