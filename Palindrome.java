import java.util.Scanner;

class Palindrome
{
    public static void main(String[] args)
    {
        int r,sum = 0,temp;
         Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter No : ");
        int n = sc.nextInt();
        
        temp = n;
        while(n>0)
        {
            r = n%10;
            sum=(sum*10)+r;
            n = n/10;
        }
        
        if(temp == sum)
            System.out.println("Plindrome Number ");
        else
            System.out.println("Not Palindrome Number ");  
    }
}