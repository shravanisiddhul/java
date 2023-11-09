import java.util.Scanner;
public class Exercise3 {
    public static void greatNo(int a,int b)
    {
        if(a > b)
        {
            System.out.println("A is Greater No.");
        }
        else{
            System.out.println("B is Greater No.");
        }
        return ;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        greatNo(a,b);
    }
    
    
}
