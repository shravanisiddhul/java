import java.util.*;
public class twoDArray {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No.of Rows : ");
        int rows =sc.nextInt();
        System.out.println("Enter no. of Colunms :");
        int coln = sc.nextInt();

        int number[][] = new int [rows][coln];

        System.out.println("Enter Elements of a Matrix");

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<coln; j++)
            {
                number[i][j] = sc.nextInt();
            }
        }

        System.out.println("The 2D Array is : ");

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<coln; j++)
            {
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }
    }    
}
