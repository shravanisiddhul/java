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

    public static int intersection(int arr1[],int arr2[])
    {
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<arr1.length;i++)
        {
            set.add(arr1[i]);
        }

        int count = 0;
        for(int i=0;i<arr2.length;i++)
        {
            if(set.contains(arr2[i]))
            {
                count++;
                set.remove(arr2[i]);
            }
            // System.out.println(set);
        }
        // System.out.println(set);
        return count ;
    }
    public static void main(String args [])
    {
        int arr1[] = {1, 2, 3, 1, 5, 7, 6};
        int arr2[] = {3, 7, 3, 9, 8, 4};

        System.out.println(union(arr1, arr2));

        System.out.println(intersection(arr1, arr2));
    }
}