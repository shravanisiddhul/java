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
        
        System.out.println("Transpose is ");
        for(int j=0;j<cols;j++)
        {
            for(int i=0;i<rows;i++)
            {
                System.out.print(arr[i][j]+" ");  
            }
            System.out.println();
            
        }
        
    }
}