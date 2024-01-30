import java.util.*;
public class Practice{
    public static void PrintArray(int arr[])
    {
        System.out.println("Sorted Array : ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args [])
    { 
        int arr[] = {1,5,2,4,7,6};

        for(int i=0;i<arr.length-1;i++)
        {
            int smallest = i;
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }

            }
            int temp= arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp ;
        }
        PrintArray(arr);
    }
}