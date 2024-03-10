import java.util.*;
class LLProblem2 {
    public static void main(String args[])
    {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            list.add(i);
            // System.out.println(" -> ");
        }
        System.out.println(list);
        int value=-1;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(i) >= 25)
            {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}
