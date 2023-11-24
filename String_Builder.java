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
    
}
}