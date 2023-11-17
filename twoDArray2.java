import java.util.*;
public class twoDArray2 {
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows : ");
        int rows = sc.nextInt();
        System.out.println("Enter Columns : ");
        int coln = sc.nextInt();

        int number[][] = new int [rows][coln];

        System.out.println("Enter Elements of a Matrix : ");

        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<coln; j++)
            {
                number[i][j] = sc.nextInt();
            }
        }
         for(int i=0; i<rows; i++)
        {
            for(int j=0; j<coln; j++)
            {
               System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Enter Element to be Searched :");
        int x = sc.nextInt();

        for(int i=0; i<number.length; i++)
        {
            for(int j=0; j<number.length; j++)
            {
                if(number[i][j] == x)
                {
                    System.out.println("Number is found at location :"+"("+i+","+j+")");
                }
            }
            System.out.println();
        }
    }    
}
