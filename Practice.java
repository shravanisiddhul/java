import java.util.*;
public class Practice
{
    public static void main(String args [])

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 or 1:");
        int n =sc.nextInt();

        
        do{
            System.out.println("Enter Marks :");
            int marks = sc.nextInt();
            
            if(marks>=90 && marks<=100)
            {
                System.out.println("This is Good");
            }
            else if(marks >=89 && marks<=60)
            {
                System.out.println("This is also Good");
            }
            else 
            {
                System.out.println("This is Good as well");
            }
            System.out.println("Do you want to continue \nThen Enter 0 or 1 :");
            n =sc.nextInt();

        }while( n==1);
    
    }
}