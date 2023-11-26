import java.util.Scanner;

public class Practice
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();

        for(int i=str.length();i>0; i--)
        {
            System.out.print(str.charAt(i-1));
        }
        System.out.println(str.length());
    }
}