import java.util.*;
public class Practice1
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [4];
        System.out.println("Enter elements in array 1 :");
        for(int i=0;i<4;i++)
        {
            arr[i] = sc.nextInt();
        }

        int arr2[] = new int [4];
        System.out.println("Enter elements in array 2 :");
        for(int i=0;i<4;i++)
        {
            arr2[i] = sc.nextInt();
        }
    }
       
        int result[] = new int [4];
        for(int i=0;i<4;i++)
        {
            int[] arr;
            int[] arr2;
            result[i] = arr[i] + arr2[i];
            System.out.println(result);
        }


}