import java.util.*;
public class Bits {
    public static void main(String args [])
    {
        int n = 5;
        int pos = 2;
        int BitMask = 1 << pos;
        if((BitMask & n) == 0)
        {
            System.out.println("Bit was Zero");
        }
        else{
            System.out.println("Bit was Non zero");
    }
}
}
