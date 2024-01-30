import java.util.Scanner;
public class function1
{
    public static void printMyName(String name)
    {
        System.out.println(name);
        return;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name :");
        String name = sc.next();

        printMyName(name);
    }
}