import java.util.*;
public class practice2 
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int [2][3];
        System.out.println("Enter elements in an array  : ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }

        int total = 0;
        int count = 0;
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                total += arr[i][j]; 
                count++;
            }
        }

        double average = total /count;
        System.out.println("The Average : "+average);
        
    }    
}
