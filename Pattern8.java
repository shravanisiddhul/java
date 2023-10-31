import java.util.Scanner;
public class Pattern8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows :");
        int n = sc.nextInt();
        //System.out.println("Enter no of columns : ");
        //int m = sc.nextInt();

        for(int i=n; i>=1; i--)
        {
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            
            System.out.println();
        }
    }
}
 
