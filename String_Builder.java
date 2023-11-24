import java.util.*;
public class String_Builder {
    public static void main(String args[])
    {
        StringBuilder sb = new StringBuilder("Shravani");
        System.out.println(sb);

        //print character
        System.out.println(sb.charAt(4));

       //character change
        sb.setCharAt(1, 't');
        System.out.println(sb);

        sb.setCharAt(1, 'h');
        System.out.println(sb);

       //insert character
        sb.insert(5, 'a');
        System.out.println(sb);

        //delete 
        sb.delete(5, sb.length());
        System.out.println(sb);
}
}