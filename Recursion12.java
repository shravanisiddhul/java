import java.util.*;
public class Recursion12 
{
    // Count Path of Maze
    
    public static int CountMaze(int i,int j,int n,int m)
    {
        if(i == n || j==m )
        {
           return 0; 
        }
        if(i == n-1 && j == m-1)
        {
            return 1;
        }
        // move right
        int downpath = CountMaze(i+1, j, n, m);

        //  move downward
        int rightpath = CountMaze(i, j+1, n, m);
         
        return downpath+rightpath;
        
    }
    
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter m : ");
        int m = sc.nextInt();
        
        int totalPath = CountMaze(0, 0, n, m);
        System.out.println("Total Path : "+totalPath);

    }
}
