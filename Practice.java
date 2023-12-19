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
            //Array is sorted
            return IsSorted(arr, i+1);
        }
        else{
            return false;
        }
    }    
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of an Array : ");
        int size = sc.nextInt();
        int arr[] = new int [size];
        System.out.println("Enter elemnents of an Array : ");

        for(int i=0 ; i<size; i++)
        {
            arr[i] = sc.nextInt(); 
        }
        // for(int i=0; i<arr.length;i++)
        // {
        //     System.out.println(arr[i]+" ");
        // }
        System.out.println(IsSorted(arr, 0));
    }
}