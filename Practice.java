import java.util.*;
public class Practice
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array : ");
        int size = sc.nextInt();

        int Num[] = new int [size];

        System.out.println("Enter Elements in Array : ");
        for(int i = 0; i<size; i++)
        {
            Num[i] = sc.nextInt();
        }
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0; i<Num.length-1; i++)
        {
            if( Num[i] < min)
            {
                min = Num[i];
            }
            if( Num[i] > max)
            {
                max = Num[i];
            }
            
        }
        System.out.println("Minimum Value : "+min);
        System.out.println("Maximum Value : "+max);
        
    }

}