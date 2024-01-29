import java.util.*;
public class Practice{
    
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = sc.nextInt();

        int  arr[] = new int [size];
        System.out.println("Enter Numbers : ");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        boolean isAscending = true;
        for(int i=0; i<arr.length-1;i++)
        {
            if(arr[i] > arr[i+1])
            {
                isAscending = false;
            }
        }
        if(isAscending)
        {
            System.out.println("Array is in Ascending order");
        }else{
            System.out.println("Array is not in ascending order");
        }

        System.out.println("Sorted Array is : ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1 ;j<arr.length;j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]+ " ");
        }
        
    }
}