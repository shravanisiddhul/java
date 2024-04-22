import java.util.HashSet;

public class HashMapPro_2 {
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
        int arr1[] = {1, 2, 3, 1, 4};
        int arr2[] = {3, 5 ,6, 2, 7};

        System.out.println(union(arr1, arr2));
    }
}
