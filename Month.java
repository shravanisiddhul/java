import java.util.Scanner;

public class Month {
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Choice from a to l :");
        char month = sc.next().charAt(0);
        //System.out.println("Enter your Choice from a to l :");
        switch(month)
        {
            case 'a' : 
            System.out.println("January");
            break;

            case 'b' : 
            System.out.println("February");
            break;

            case 'c' :
            System.out.println("March");
            break;

            case 'd' :
            System.out.println("April");
            break;

            case 'e' : 
            System.out.println("May");
            break;

            case 'f' :
            System.out.println("June");
            break;

            case 'g' :
            System.out.println("July");
            break;

            case 'h' : 
            System.out.println("August");
            break;

            case 'i' :
            System.out.println("September");
            break;

            case 'j' : 
            System.out.println("October");
            break;

            case 'k' :
            System.out.println("November");
            break;

            case 'l' :
            System.out.println("December");
            break;

            default :
            System.out.println("Invalid Month");

        }
        
    }

}
