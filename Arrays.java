import java.util.Scanner;
public class Arrays
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array : ");
        int size = sc.nextInt();
        int number[] = new int [size];

        for (int i=0; i<size ; i++)
        {
            number[i]= sc.nextInt();
        }

        for(int i=0;i<size;i++)
        {
            System.out.println(number[i]+" ");
        }
        System.out.println("Enter an Element to be Searched :");
        int x = sc.nextInt();

        for(int i=0; i<number.length; i++)
        {
            if(number[i]==x)
            {
                System.out.println("X is found at "+i);
            }
        }
    }
}