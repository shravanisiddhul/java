import java.util.*;
public class FactRecursion {
    public static void PrintFact(int i,int n,double fact)
    {
        if(i == n+1)
        {
            System.out.println(fact);
            return;
        }

        fact = fact * i ;
        PrintFact(i+1, n, fact);
    }
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int n = sc.nextInt();
        int i = 1;
        double fact = 1;
        PrintFact(i, n, fact);

    }    
}
