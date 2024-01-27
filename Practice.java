import java.util.*;
public class Practice{
    public static void GreaterNo(int a,int b){
        if(a>b)
        {
            System.out.println(a+" is grater than "+b);
        }
        else{
            System.err.println(b+" is geater than "+a);
        }
        return;
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Numbers ");
        System.out.println("Enter A :");
        int a = sc.nextInt();
        System.out.println("Enter B : ");
        int b = sc.nextInt();

        GreaterNo(a, b);
    }
}