import java.util.*;
public class StringB_problem {
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int size = sc.nextInt();

        String str[] = new String[size];
        System.out.println("Enter String : ");

        for(int i=0; i<size; i++)
        {
            str[i] = sc.next();
        }
        
        int total_length=0;
        for(int i=0;i<str.length; i++)
        {
            System.out.println(str[i]);
            total_length = total_length + str[i].length();

        }
        System.out.println("Total_length is : "+total_length);

    }    
}
