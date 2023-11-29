import java.util.*;
public class StringB_3 {  
    public static void main(String args[])
    {    
        StringBuilder sb=new StringBuilder();    
        System.out.println(sb.capacity());   
        sb.append("Hello");    
        System.out.println(sb.capacity());   
        sb.append("Java is my favourite language");    
        System.out.println(sb.capacity());    
        sb.ensureCapacity(10);  
        System.out.println(sb.capacity());    
        sb.ensureCapacity(50);  
        System.out.println(sb.capacity());
    }    
}
