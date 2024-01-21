import java.util.*;
public class Practice
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number :");
        int n = sc.nextInt();

        boolean isPrime = true;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i == 0)
            {
                isPrime = false;
                break;
            }
        }
        if(isPrime)
        {
            if(n==1)
            {
                System.out.println("Neither Prime Nor composite");
            }
            else{
                System.out.println("Prime");
            }
        }
        else{
            System.out.println("Not Prime");
        }
    }

}
// import java.util.*;


// public class Practice {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();


//        boolean isPrime = true;
//        for(int i=2; i<=n/2; i++) {
//            if(n % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }


//        if(isPrime) {
//            if(n == 1) {
//                System.out.println("This is neither prime not composite");
//            } else {
//                System.out.println("This is a prime number");
//            }
//        } else {
//            System.out.println("This is not a prime number");
//        }
//    }   
// }
