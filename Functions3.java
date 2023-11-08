import java.util.Scanner;
public class Functions3 {

    public static int Product(int a,int b)
    {
        return a * b;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A : ");
        int a = sc.nextInt();
        System.out.println("Enter B : ");
        int b = sc.nextInt();

        

        System.out.println("Multiplication of 2 Numbers are "+Product(a,b));
    }
}
