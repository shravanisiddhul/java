import java.util.LinkedList;

public class Practice
{

    public static void main(String args[])
    {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(2);
        list.addLast(3);
        list.addFirst(1);
        list.addLast(4);
        list.addFirst(0);
        list.addLast(5);
        
        for(int i=0;i< list.size();i++)
        {
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("Null");
        System.out.println(list.size());

        list.removeFirst();
        list.removeLast();

        for(int i=0;i< list.size();i++)
        {
            System.out.print(list.get(i)+" -> ");
        }
        System.out.println("Null");
        System.out.println(list.size());
    }
}