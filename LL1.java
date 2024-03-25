import java.util.*;

class LL1{

    public static void main(String args [])
    {
       LinkedList<String> list = new LinkedList<>();
       list.addFirst("1");
       list.addFirst("0");
       list.addLast("2");
       list.addLast("3");
       System.out.println(list);

       System.out.println(list.size());

       for(int i=0;i<list.size();i++)
       {
            System.out.print(list.get(i)+" -> ");
       }
       System.out.println("Null");

       list.removeFirst();
       list.removeLast();
       System.out.println(list);

       System.out.println(list.size());
    }
}
