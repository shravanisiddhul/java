import java.util.*;
public class Practice{
    public static boolean IsSorted(int arr[],int i)
    {
        if(i == arr.length-1)
        {
            return true;
        }
        if(arr[i] < arr[i+1])
        {
            // array is sorted until now
            return IsSorted(arr, i+1);
        }else{
            return false;
        }

    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elemnts of an Array of size 5 : ");
        int arr[] = new int [5];

        for(int i=0; i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println(IsSorted(arr, 0));
    }
}