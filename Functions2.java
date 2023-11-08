import java.util.Scanner ;

public class Functions2
{
    public static int addition(int a, int b)
    {
        int sum = a + b;
        return sum;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A : ");
        int a = sc.nextInt();
        System.out.println("Enter B : ");
        int b = sc.nextInt();

        int sum = addition(a,b);

        System.out.println("Addition of A and B is "+sum);        

    
    }
}