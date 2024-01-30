import java.util.*;
public class Practice
{
    public static void Print(int n)
    {
        if(n == 0)
        {
            return;
        }
        System.out.println(n);
        Print(n-1);
    }
    public static void main(String args [])
    {
        int n = 5;
        Print(n);
    }
}