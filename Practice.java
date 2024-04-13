import java.util.HashSet;
import java.util.Iterator;
public class Practice
{
    public static void main(String args [])
    {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        System.out.println(set);
        System.out.println("Size is : "+set.size());

        if(set.contains(3))
        {
            System.out.println("Contains 3");
        }else{
            System.out.println("Not contains");
        }

        set.remove(4);
        System.out.println(set);
        System.out.println("Size is : "+set.size());

        Iterator it = set.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        System.out.println("Null");
    }

}