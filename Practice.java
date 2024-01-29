import java.util.*;
public class Practice
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter Columns: ");
        int cols = sc.nextInt();

        System.out.println("Enter elements in an array : ");
        int arr[][]= new int [rows][cols];

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("Enter element to be searched : ");
        int x = sc.nextInt();
        boolean found=false;
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(arr[i][j] ==  x)
                {
                    System.out.println(x+ " is found at ("+i+","+j+")");
                    found = true;
                }
            }
        }
        if(!found)
        {
            System.out.println(x+ " is not found in the array ");
        }
    }
}