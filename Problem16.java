import java.util.Scanner;
public class Problem16 {
    public static void Mul_table(int n)
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
        //System.out.println();
        return;   
    } 
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n = sc.nextInt();

        Mul_table(n);
    }
}
