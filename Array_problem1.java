import java.util.*;
public class Array_problem1 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an Array : ");
        int size = sc.nextInt();

        String ch[] = new String[size];

        System.out.println("Enter Elements : ");
        for(int i=0; i<size; i++)
        {
            ch[i] = sc.next();
        }

        for(int i=0; i<size; i++)
        {
            System.out.println(ch[i]+" ");
        }
    }    
}
