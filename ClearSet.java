import java.util.*;
public class ClearSet {
    public static void main(String args [])
    {
        int n = 5;
        int pos = 2;
        int BitMask = 1 << pos;
        
        int newNumber = ( ~BitMask & n);
        System.out.println(newNumber);

    }    
}
