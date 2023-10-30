import java.util.Scanner;

public class Pattern2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of rows : ");
        int n = sc.nextInt();
        System.out.println("Enter no. of columns : ");
        int m = sc.nextInt();

        for( int i = 1; i <= n; i++)
        {
            for(int j = 1; j<=m; j++)
            {
                if(i == 1 || j==1 || i ==n || j==m)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }    
}
