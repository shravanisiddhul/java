import java.util.*;
public class SelectionSort {
    // print array
    public static void Array(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args [])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter array : ");
        int arr[] = new int [5];

        // input array
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        // swapping
        for(int i=0; i<arr.length-1; i++)
        {
            int smallest = i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[smallest] > arr[j])
                {
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i]= temp;
        }
        Array(arr); 
    }    
}
