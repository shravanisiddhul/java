import java.util.HashSet;

public class HashMapPro_3 {
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
                // System.out.println(set);
                set.remove(arr2[i]);
            }
        }
        // System.out.println(set);
        return count;
    }
    public static void main(String args [])
    {
        int arr1[] = {2, 3, 5, 5};
        int arr2[] = {6, 9, 2, 5, 3};
        System.out.println(intersection(arr1, arr2));
    }
}
