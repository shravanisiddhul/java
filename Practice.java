import java.util.*;
public class Practice
{
    public static int CountMaze(int i,int j,int n,int m)
    {
        if(i == n || j==m)
        {
            return 0;
        }
        if(i == n-1 && j == m-1)
        {
            return 1;
        }

        // downword move
        int downpath = CountMaze(i+1, j, n, m);

        // right move
        int rightmove = CountMaze(i, j+1, n, m);

        return downpath + rightmove;
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n :");
        int n = sc.nextInt();
        System.out.println("Enter m :");
        int m = sc.nextInt();

        int TotalPath = CountMaze(0, 0, n, m);
        System.out.println("Total Path : "+TotalPath);
    }
}