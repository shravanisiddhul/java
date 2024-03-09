import java.util.*;

class Arraylist
{
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<>();

        // Add elements 
        list.add(0);
        list.add(11);
        list.add(13);
        list.add(14);
        System.out.println(list);

        // get element
        System.out.println(list.get(0));

        // set element
        list.set(0, 10);
        System.out.println(list);
        list.set(0, 15);

        // add 12 between 11 and 13
        list.add(2, 12);

        // sort
        Collections.sort(list);
        System.out.println(list);

        int size = list.size();
        System.out.println("Length of array is :"+" "+size);

    }

}