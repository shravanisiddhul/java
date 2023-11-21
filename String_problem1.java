import java.util.*;
public class String_problem1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int size = sc.nextInt(); 

        String array[] = new String[size];

        System.out.println("Enter Strings in Array : ");

        for(int i=0; i<size;i++)
        {
            array[i] = sc.next();
        }

        int TotalLength = 0;
        for(int i=0; i<array.length;i++)
        {
            System.out.println(array[i]);
            TotalLength = TotalLength+array[i].length();

        }
        System.out.println(TotalLength);

    }    
}