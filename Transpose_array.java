import java.util.*;
public class Transpose_array {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows : ");
        int n = sc.nextInt();
        System.out.println("Enter Columns : ");
        int m = sc.nextInt();

        int matrix[][] = new int [n][m];

        System.out.println("Enter matrix elements : ");

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix is :");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Transpose of MAtrix is");

        for(int j=0; j<n; j++)
        {
            for(int i=0; i<m; i++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }    
}
