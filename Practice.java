import java.util.*;
public class Practice
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size : ");
        int size = sc.nextInt();
        int sum = 0;
        
        int number[] = new int [size];

        System.out.println("Enter Array elements : ");
        for(int i=0; i<size; i++)
        {
            number[i] = sc.nextInt();
        }

        System.out.println("Entered Array Elements are : ");
        System.out.print("{");
        for(int i= 0; i<number.length; i++)
        {
            System.out.print(number[i]+" ");
            sum = sum + number[i];
            
        }
        System.out.println("}");
        System.out.println();
        System.out.println("Sum is "+sum);
        
} 
}