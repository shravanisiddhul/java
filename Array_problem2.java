import java.util.*;
public class Array_problem2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array : ");
        int size = sc.nextInt();

        int number[] = new int [size];

        for(int i=0; i<size; i++)
        {
            number[i] = sc.nextInt();
        }
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i < number.length; i++)
        {
            if(number[i] < min)
            {
                min = number[i];
                //System.out.println("Largest Number : "+min);
            }
            if(number[i] > max)
            {
                max = number[i];
                //System.out.println("Minimum Number : "+max);
            }                
            
        }
        System.out.println("Minimum Number is : "+min);
        System.out.println("Maximum Number is : "+max);
    }
}