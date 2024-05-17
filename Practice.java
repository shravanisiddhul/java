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

        for(int i= size-1;i>=0;i--)
        {
            System.out.print(n[i]+" ");
        }

    }
}