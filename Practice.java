import java.util.Scanner;
public class Practice
{
    public static void main(String args [])
    {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = sc.nextInt();
        int [] n = new int[5];
        

        for(int i=0;i<size;i++)
        {
            n[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i=0;i<n.length-1;i++)
        {
            if(n[i] > n[i+1])
            {
                isAscending = false;
            }
        }

        if(!isAscending)
        {
            System.out.println("Array is in not ascending order");
        }
        else{
            System.out.println("Array is in ascending order");
        }
    }
}