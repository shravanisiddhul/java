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

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<size;i++)
        {
            if(n[i] > max)
            {
                max = n[i];
            }
            if(n[i] < min)
            {
                min = n[i];
            }

        }

        System.out.println("Minimum value: " +min);
        System.out.println("Maximum value: "+max);

    }
}