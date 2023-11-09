import java.util.Scanner;
public class Excercise1 {

    public static void average(int a,int b,int c)
    {
        int avg;
        avg = (a + b + c) / 3;
        System.out.println("Average of 3 Numbers is "+avg);
        return;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 Numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int avg;
        avg = (a + b + c) / 3;
        System.out.println("Average of 3 Numbers is "+avg);
        }
}
