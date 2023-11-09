import java.util. Scanner;
public class Exercise4 {
    public static float circle(float r)
    {
        float pi = (float) 3.14;
        float circumference = (float) (2 * pi * r);
        System.out.println("Circumference of "+r+" is "+circumference);

        float area = pi * r * r;
        System.out.println("Area of "+r+" is "+area);
        return 0;
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius : ");
        float r = sc.nextFloat();
        
        circle(r);

    }    
}
