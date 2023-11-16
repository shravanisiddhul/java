import java.util.Scanner;
public class Array_problem_3 {
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

        boolean isAscending = true;

        for(int i=0; i<number.length-1;i++)
        {
            if(number[i] > number[i+1])
            {
                isAscending = false;
            }
        }
        if(isAscending)
        {
            System.out.println("Array is in Ascending Order ");
        }
        else
        {
            System.out.println("Array is not in Ascending Order ");
        }


    }
}    
