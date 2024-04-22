import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String args [])
    {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1); //it does not allow duplicate values
        set.add(4);
        set.add(2);

        // print set
        System.out.println(set);

        // size
        System.out.println("Size of set is : "+set.size());

        // contain 
        if(set.contains(1))
        {
            System.out.println("Set contains 1");
        }else if(!set.contains(6))
        {
            System.out.println("Does not Contain");
        }

        // delete
        set.remove(4);
        System.out.println(set);
        System.out.println("Size of set is : "+set.size());

        @SuppressWarnings("rawtypes")
        Iterator it = set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("Null");
    }
}
