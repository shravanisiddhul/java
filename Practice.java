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

        // Selection Sort
        for(int i=0;i<arr.length;i++){
            int smallest = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[smallest] > arr[j])
                {
                    smallest = j;
                }
            }
            int temp =arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        PrintArray(arr);
    }
}