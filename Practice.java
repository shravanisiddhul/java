import java.util.*;
public class Practice
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        
        int n ;
        while(true)
        {
            System.out.println("Enter the number :");
            n = sc.nextInt();
            if(n%5==0 && n%3==0)
            {
                System.out.println(+n+" is divisible by 3 & 5 ");
                break;
            }
        }
    }
}