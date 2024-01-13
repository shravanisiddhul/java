import java.util.*;
public class Practice
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array : ");
        int size = sc.nextInt();

        int Num[] = new int [size];

        System.out.println("Enter Elements in Array : ");
        for(int i = 0; i<size; i++)
        {
            Num[i] = sc.nextInt();
        }
        
        System.out.println("Enter Element to be Serached : ");
        int x = sc.nextInt();
        for(int i=0; i<Num.length; i++)
        {
            if(Num[i] == x)
            {
                System.out.println("X is found At : "+i);
            }
        }       
    }
}