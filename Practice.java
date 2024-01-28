import java.util.*;
public class Practice{
    
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = sc.nextInt();

        String  arr[] = new String [size];
        System.out.println("Enter Names : ");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.next();
        }
        System.out.println("Name of "+size+" BTS members  are : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println((i+1)+". "+arr[i]);
        }
    }
}