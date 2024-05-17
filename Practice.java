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

        System.out.println("Enter element to be search : ");
        int x = sc.nextInt();
        for(int i=0;i<size;i++)
        {
            if(n[i] == x)
            {
                System.out.println(x+" is found at : "+i);
            }
            // System.out.print(n[i]+" ");
            
        }
        System.out.println("Element is not present in an array");

    }
}