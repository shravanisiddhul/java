// import java.util.*;
public class Practice
{
    public static void Print(int n)
    {
        
        if(n == 6)
        {
            return;
        }
        System.out.println(n);
        Print(n+1);
    }
    public static void main(String args [])
    {
        int n = 1;
        Print(n);
    }
}