import java.util.Scanner;

public class problem1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("Sum of Natural Numbers : "+sum);
    }
}
