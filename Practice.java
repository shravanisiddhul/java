import java.util.*;
public class Practice{
    public static void Circumference(float r,float pi){
        float circumference = 2*pi*r;
        System.out.println("Circumferenceof a Circle :"+circumference );
        return;
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter radius :");
        float r = sc.nextFloat();
        float pi = (float) 3.14;

        Circumference(r,pi);
    }
}