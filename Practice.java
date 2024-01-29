import java.util.*;
public class Practice{
    
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = sc.nextInt();

        int  arr[] = new int [size];
        System.out.println("Enter Names : ");
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

       for(int i=0;i<arr.length;i++)
       {
            if(arr[i] < min)
            {
                min = arr[i];
            }
            if(arr[i] > max)
            {
                max = arr[i];
            }
       } 
       System.out.println("Maximum Value : "+max);
       System.out.println("Minimum Value : "+min);
    }
}