import java.util.*;
public class practice2 
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int arr[][][] = new int [1][2][3];
        System.out.println("Enter elements in an array  : ");
        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<2;j++)
            {
                for(int k=0;k<=3;k++)
                {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }

        for(int i=0;i<=2;i++)
        {
            for(int j=0;j<=2;j++)
            {
                for(int k=0;k<=3;k++)
                {
                    System.out.println(arr[i]);
                }
                System.out.println();
            }
            System.out.println();
        }

        // int total = 0;
        // int count = 0;
        int min = 0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                for(int k=0;k<arr.length;i++)
                {
                    min = Integer.MAX_VALUE;
                    System.out.println(min);
                }
            }
            System.out.println(min);
        }

        // double average = total /count;
        // System.out.println("The Average : "+average);
        
    }    
}
