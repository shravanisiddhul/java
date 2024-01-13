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
        Boolean IsAscending = true;

        for(int i=0; i<Num.length-1; i++)
        {
            if(Num[i] > Num[i+1])
            {
                IsAscending = false;
                break;
            }
        }
        if(IsAscending)
        {
            System.out.println("Array is in Ascending Order ");
        }
        else{
            System.out.println("Array is not in Ascending Order");
        
            for(int i=0 ; i<Num.length-1; i++)
            {
                for(int j=0; j<Num.length-i-1; i++)
                {
                    if(Num[j] > Num[j+1])
                    {
                        int temp =Num[j];
                        Num[j] = Num[j+1];
                        Num[j+1] = temp;                
                    }
                }
            }
        }

        System.out.println("Sorted Array : ");
        for(int i=0; i<Num.length; i++)
        {
            System.out.print(Num[i]+ " ");
        }
        
    }

}