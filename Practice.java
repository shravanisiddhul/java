import java.util.*;
public class Practice
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = sc.nextInt();

        String arr[] = new String[size];

        System.out.println("Enter elements in an array : ");
        for(int i=0 ;i<size;i++)
        {
            arr[i] = sc.next();
        }

        for(int i =0;i<size; i++)
        {
            char firstchar = Character.toLowerCase(arr[i].charAt(0));
            if(firstchar == 'a' || firstchar == 'e' || firstchar == 'i' || firstchar == 'o' || firstchar == 'u')
            {
                System.out.println(arr[i]);
            }
        }
    }
}