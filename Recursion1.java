import java.util.*;

// import javax.swing.text.PlainDocument;
public class Recursion1 {
    public static int PlaceTiles(int n,int m)
    {
        if(n == m)
        {
            return 2;
        }
        if(n < m)
        {
            return 1;
        }
        // placed vertically
        int vertPlacements = PlaceTiles(n-m, m);

        // placed horizontally
        int horiPlacements = PlaceTiles(n-1, m);

        return vertPlacements + horiPlacements;
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        System.out.println("Enter m : ");
        int m = sc.nextInt();

        System.out.println(PlaceTiles(n, m));
    }
}
