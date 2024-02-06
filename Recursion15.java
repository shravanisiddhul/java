import java.util.*;
public class Recursion15 {
    // subset of set 

    // printing subset
    public static void printSubset(ArrayList<Integer> subset)
    {
        for(int i=-0;i<subset.size();i++)
        {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }

    // finding subset 
    public static void FindSubsets(int n,ArrayList<Integer> subset)
    {
        if(n == 0)
        {
            printSubset(subset);
            return;
        }
        // when added
        subset.add(n);
        FindSubsets(n-1, subset);

        // when not added
        subset.remove(subset.size()-1);
        FindSubsets(n-1, subset);
        
    }
    public static  void main(String args [])
    {

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter number of elements in array : ");
        int n = sc.nextInt();
        ArrayList<Integer> subset = new ArrayList<>();

        FindSubsets(n, subset);
    }    
}
