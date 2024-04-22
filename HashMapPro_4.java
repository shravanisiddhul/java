import java.util.HashMap;

public class HashMapPro_4 {
    private static final HashMap<String, String> ticket = null;
    public static String getStart(HashMap<String,String> ticket)
    {
        HashMap<String,String> revMap = new HashMap<>();

        for(String key : ticket.keySet())
        {
            revMap.put(ticket.get(key), key);
        }

        for(String key : ticket.keySet())
        {
            if(!revMap.containsKey(key))
            {
                return key;
            }
        }
        return null;
    }
    public static void main(String args[])
    {
       HashMap<String ,String > ticket = new HashMap<>();
       ticket.put("Chennai", "Bangaluru");
       ticket.put("Mumbai", "Delhi");
       ticket.put("Goa", "Chennai");
       ticket.put("Delhi", "Goa");

       String start = getStart(ticket);
        System.out.println();
       while(ticket.containsKey(start))
       {
            System.out.print(start+" -> ");
            start = ticket.get(start);
       }
       System.out.println(start);
    }
}
