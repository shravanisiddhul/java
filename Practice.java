import java.util.*;
public class Practice {
    public static void Array(int arr[])
    {
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter An Array : ");
        int arr[] = new int [5];

        for(int i=0; i<arr.length; i++)
        {
            arr[i] =sc.nextInt();
        }

        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=0; j<arr.length-i-1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
        Array(arr);
    }
}