import java.util.*;

//import javax.sql.rowset.spi.SyncResolver;

public class Calculator
{
    public static void main(String[] args)
    {
        double result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose An Operator : +,-,*,/ ");
        char operator = sc.next().charAt(0);
        System.out.println("Enter A : ");
        int a = sc.nextInt();
        System.out.println("Enter B : ");
        int b = sc.nextInt();

        switch(operator)
        {
            case '+':
            result = a + b;
            System.out.println("Addition :"+ result);
            break;

            case '-' :
            result = a - b;
            System.out.println("Subtraction :"+ result);
            break;

            case '*' :
            result = a * b;
            System.out.println("Multiplication :"+ result);
            break;

            case'/' :
            result = a / b;
            System.out.println("Division : "+ result);
            break;
        
            default :
            System.out.println("Invalid Operator ");
        }
}
}
