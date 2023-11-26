import java.util.Scanner;

public class Practice
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :");
        String str = sc.nextLine();

        String reverse = "";
        for(int i=str.length()-1; i>=0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        if(str.equals(reverse))
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}