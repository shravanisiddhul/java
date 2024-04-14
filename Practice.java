import java.util.HashSet;

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
        System.out.println("Size of Set is : "+set.size());

        if (set.contains(3)) {
            System.out.println("Contain 3");
        }else{
            System.out.println("Does not Contain");
        }

        set.remove(4);
        System.out.println(set);
        System.out.println("Size of Set is : "+set.size());
    }
}