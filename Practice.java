import java.util.*;
public class Practice
{
    public static void SortedArray(int Arr[])
    {
        for(int i=0; i<Arr.length; i++)
        {
            System.out.print(Arr[i]+" ");
        }
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array : ");
        int size = sc.nextInt();

        int Arr[] = new int [size];

        System.out.println("Enter Elements in an Array : ");
        for(int i=0; i<size; i++)
        {
            Arr[i] = sc.nextInt();
        }

        System.out.println("Sorted Array : ");
        for(int i=0; i<Arr.length-1; i++)
        {
            for(int j=0; j<Arr.length-i-1; i++)
            {
                if(Arr[j] > Arr[j+1])
                {
                    int temp = Arr[j];
                    Arr[j] = Arr[j+1];
                    Arr[j+1] = temp;
                }
            }
        }
        SortedArray(Arr);
    }
}