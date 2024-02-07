public class Practice
{
    public static void main(String args [])
    {
        int i=1;
        int j=2;
        int k=1;
        while(i<=3){
            while(j<=4)
            {
                while(k<=3)
                {
                    System.out.println(i*j*k);
                    k++;
                }
                j++;
            }
            i++;
        }
    }
}