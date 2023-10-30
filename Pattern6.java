import java.util.Scanner;
public class Pattern6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows :");
        int n = sc.nextInt();
        int number=1;
        //System.out.println("Enter no of columns : ");
        //int m = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++){
                System.out.print(number+" ");
                number++;
            }
            
            
            System.out.println();
        }
    }
}

