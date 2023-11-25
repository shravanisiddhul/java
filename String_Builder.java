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
        
        //append
        sb.append(" Siddhul");
        System.out.println(sb);

        //reverse String
        // sb.reverse();
        // System.out.println(sb);
        
        //reverse
    for(int i=0; i<sb.length()/2; i++)
    {
        int front = i;
        int back = sb.length()-i-1;

        char frontchar = sb.charAt(front);
        char backchar = sb.charAt(back);

        sb.setCharAt(front, backchar);
        sb.setCharAt(back, frontchar);
    }
    System.out.println(sb);

}
}