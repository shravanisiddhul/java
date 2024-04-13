import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Hashing1{
    public static void main(String args [])
    {
        HashMap<Integer, String > map = new HashMap();
        map.put(1,"Shravani");
        map.put(2, "Mahi");
        map.put(3, "Vijju");
        map.put(4, "Nanda");
        map.put(5, "Shrushti");

        System.out.println(map);

        System.out.println(map.size());

        if(map.containsKey(4))
        {
            System.out.println("Key is present");
        } 
        
        if(!map.containsKey(6)){
            System.out.println("Key is not present");
        }
        map.remove(5);
        System.out.println(map);
        System.out.println("Size : "+map.size());

        // Iteration
        // for(int val : arr)
        for(Map.Entry<Integer,String> e : map.entrySet())
        {
            System.out.println(e.getKey()+ " : "+e.getValue());
            // System.out.print(e.getValue());
        }
        
    }
}