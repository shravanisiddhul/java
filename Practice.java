import java.util.*;
public class Practice
{
    public static void printSubset(ArrayList<Integer> subset)
    {
        for(int i=0;i<subset.size();i++)
        {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubset(int n,ArrayList<Integer> subset)
    {
        if(n == 0)
        {
            printSubset(subset);
            return;
        }
        // when added
        subset.add(n);
        findSubset(n-1, subset);

        // when not added
        subset.remove(subset.size()-1);
        findSubset(n-1, subset);
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter of elements : ");
        int n = sc.nextInt();
        ArrayList<Integer> subset = new ArrayList<>();

        findSubset(n, subset);
    }

}