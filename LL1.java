import java.util.*;

class LL1{

    public static void main(String args [])
    {
       LinkedList<String> list = new LinkedList<>();
       list.addFirst("a");
       list.addFirst("is");
       list.addLast("List");
       list.addFirst("These");
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
