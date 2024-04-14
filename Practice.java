import java.util.HashMap;

// import java.util.Iterator;
import java.util.Map;
// import java.util.Map.Entry;

public class Practice
{
    public static void main(String args [])
    {
        HashMap<Integer,String > map = new HashMap<>();
        map.put(1, "Shrav");
        map.put(2, "mahi");
        map.put(3, "Vijju");
        map.put(4, "Nanda");

        System.out.println(map);

        System.out.println("Size of Map is "+map.size());

        if(map.containsKey(4))
        {
            System.out.println("Contain");
        }else{
            System.out.println("Does not Contain");
        }
        if(map.containsValue("Vijju"))
        {
            System.out.println("Contains");
        }else{
            System.out.println("DoesNot contain");
        }

       for(Map.Entry<Integer,String> e : map.entrySet())
       {
            System.out.println(e.getKey()+" : "+e.getValue());
       }

        map.remove(4);
        System.out.println(map);
    }

}