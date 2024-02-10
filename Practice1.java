import java.util.*;
public class Practice1
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size =sc.nextInt();
        int arr[] = new int [size];
        System.out.println("Enter elements in array 1 :");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        int arr2[] = new int [size];
        System.out.println("Enter elements in array 2 :");
        for(int i=0;i<size;i++)
        {
            arr2[i] = sc.nextInt();
        }

        int[] result = new int[size];
        // int result = new int [size];
        for(int i=0;i<size;i++)
        {
            result[i] = arr[i] + arr2[i];
        }

        System.out.println("The result is : ");
        for(int i=0;i<size;i++)
        {
            System.out.print(result[i]+" ");
        }
        
    }
}