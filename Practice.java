import java.util.*;
public class Practice
{
    public static void main(String args [])
    {
        int a = 0101;
        int b = 0110;

        int c =(a & b);
        int d =(a | b);
        int e =(a ^ b);
        int f =~a;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }        
}
