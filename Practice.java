import java.util.*;
public class Practice{
    public static void PrintArray(int arr[])
    {
        System.out.println("Sorted Array : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args [])
    {
        int arr[] = {1,22,3,2,5,5,3};

        for(int i=0;i<arr.length-1;i++)
        {
            for (int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
            
        }
        PrintArray(arr);
    }
}