import java.util.HashMap;

public class HashMapPro_5 {
    public static void main(String args [])
    {
        int arr[] = {10, 2, -2, -20, 10};
        int k = -10;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1); // empty map
        int ans = 0;
        int sum = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum = sum + arr[i];

            if(map.containsKey(sum-k))
            {
                ans = ans + map.get(sum-k);
            }

            if(map.containsKey(sum))
            {
                map.put(sum, map.get(sum) + 1);
            }else{
                map.put(sum, 1);
            }
        }
        System.out.println(ans);
    }
}
