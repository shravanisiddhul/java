import java.util.*;
public class Practice{
    public static void PrintArray(int arr[])
    {
        System.out.println("Sorted Array : ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int [7];
        for(int i=0;i<7;i++)
        {
            arr[i] = sc.nextInt();
        }

        // Insertion  Sort

        // Unsorted Array
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while(j>=0 && current < arr[j])   
            {
                arr[j+1] = arr[j];
                j--;
            } 
            arr[j+1] = current;       
        }
        PrintArray(arr);
    }
}