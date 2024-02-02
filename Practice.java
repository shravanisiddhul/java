import java.util.*;
public class Practice {
public static void main(String[] args) {
String s;
    int c= 0;
Scanner sc=new Scanner(System.in);
System.out.println("enter string");
s=sc.nextLine();
 
        s = s.toLowerCase();
      for (int i = 0; i < s.length(); i++) {
 
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
 
                || s.charAt(i) == 'i'
 
                || s.charAt(i) == 'o'
 
                || s.charAt(i) == 'u')
                {
 
                c++;
 
            }
 
        }
 
        System.out.println( "Total no of vowels in string are: "+c);
    }
}