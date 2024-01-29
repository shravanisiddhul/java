import java.util.*;
public class Practice
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size :");
        int size = sc.nextInt();

        String arr[] = new String [size];

        int total_length = 0;

        for(int i=0;i<size;i++)
        {
            arr[i] = sc.next();
            total_length += arr[i].length();
        }
        System.out.println("Total length of string is "+total_length);
    }
}