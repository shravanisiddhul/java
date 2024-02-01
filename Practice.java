import java.util.*;
public class Practice
{
    public static boolean isSorted(int arr[],int i)
    {
        if(i == arr.length-1)
        {
            return true;
        }
        if (arr[i] < arr[i+1])
        {
            return isSorted(arr, i+1);
        }else
        {
            return false;
        }
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [5];
        System.out.println("Enter an Array: ");
        for(int i=0;i<5;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println(isSorted(arr, 0));

    }
}