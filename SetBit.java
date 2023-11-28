import java.util.*;
public class SetBit {
    public static void main(String args [])
    {
        int n = 6;
        int pos = 3;
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
