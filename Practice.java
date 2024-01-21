import java.util.*;
public class Practice
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a No. : ");
        int n = sc.nextInt();

        switch(n)
        {
            case 1:
            System.out.println("January");
            break;

            case 2:
            System.out.println("February");
            break;

            case 3:
            System.out.println("March");
            break;

            case 4: 
            System.out.println("April");
            break;

            case 5:
            System.out.println("May");
            break;

            case 6:
            System.out.println("June");
            break;

            case 7: 
            System.out.println("July");
            break;

            case 8:
            System.out.println("August");
            break;

            case 9:
            System.out.println("Sept");
            break;

            case 10:
            System.out.println("Oct");
            break;

            case 11:
            System.out.println("Nov");
            break;

            case 12:
            System.out.println("Dec");
            break;

            default:
            System.out.println("Wrong input");
        }
    }
}