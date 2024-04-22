import java.util.HashSet;

public class Practice
{
    public static int union(int arr1[],int arr2[])
    {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr1.length;i++)
        {
            set.add(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++)
        {
            set.add(arr2[i]);
        }

        System.out.println(set);
        return set.size();
    }
    public static void main(String args [])
    {
        int arr1[] = {1, 2, 5, 6, 9};
        int arr2[] = {5, 6, 2, 7, 1};
        System.out.println(union(arr1, arr2));
    }
}