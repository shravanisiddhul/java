import java.util.*;
public class Practice
{
    public static int PlaceTiles(int n,int m)
    {
        if(n < m)
        {
            return 1;
        }
        if( n == m)
        {
            return 2; 
        }
        // horizontally
        int HoriPlacement = PlaceTiles(n-m, m);

        // vertically
        int VerPlacemnet = PlaceTiles(n-1, m);

        return HoriPlacement + VerPlacemnet;
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter m : ");
        int m = sc.nextInt();

        System.out.println("No of Tile Placed are : "+PlaceTiles(n, m));
    }
}