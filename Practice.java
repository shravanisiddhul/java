import java.util.*;
public class Practice{
    
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = sc.nextInt();

        int arr[] = new int [size];

        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(i+" ");
        }
    }
}