import java.util.Scanner;
public class Exercise10 {
    public static void printFibo(int n)
    {
        int n1=0;
        int n2=1;
        int n3;
        System.out.print(n1+" "+n2);
        
        for(int i=1; i<=n;i++)
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
            
        }
        //System.out.print(n1 + n2 +n);
    }   
    
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a No : ");
        int n = sc.nextInt();

        printFibo(n);


    }

}
