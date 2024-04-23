import java.util.HashMap;

public class Practice
{
    public static void majority(int arr[])
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        int n = arr.length;
        for(int i=0;i<n;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
            
        }

        for(int  key : map.keySet())
        {
            if(map.get(key) > n/4)
            {
                System.out.println(key);
            }
        }

    }
    public static void main(String args [])
    {
        int arr[] = {1, 2, 1, 2, 4, 5, 3, 9, 1, 1, 2, 2, 1};
        majority(arr);
    }
}