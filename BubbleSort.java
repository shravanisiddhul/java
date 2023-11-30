import java.util.*;
public class BubbleSort {
 
    // printing function 
    public static void ArrayPrint(int array[])
    {
        for(int i=0; i<array.length; i++)
        {
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);

        // size 
        System.out.println("Enter Size : ");
        int size = sc.nextInt();

        // initializing
        System.out.println("Enter Array Elements : ");
        int array[] = new int[5];

        // input array
        for(int i=0; i<5; i++)
        {
            array[i] = sc.nextInt();
        }
        // int array[] = {2,4,1,5,3};

        // swapping 
        for(int i=0; i<array.length-1; i++)
        {
            for(int j=0; j<array.length-i-1; j++)
            {
                if(array[j]> array[j+1])
                {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
                
            }
        }
        ArrayPrint(array);
    }    
}
