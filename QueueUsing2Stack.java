import java.util.Stack;
public class QueueUsing2Stack {
    static class Queue
    {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty()
        {
            return s1.isEmpty();
        }
        public void push(int data)
        {
            while(!s1.isEmpty())
            {
                s2.push(s1.pop());
            }
            s1.push(data);
            while(!s2.isEmpty())
            {
                s1.push(s2.pop());
            }
        }
        public int pop()
        {
            if(isEmpty())
            {
                System.out.println("Empty Queue");
                return -1;
            }
            return s1.pop();
        }
        public int peek()
        {
            if(isEmpty())
            {
                System.out.println("Empty Queue");
                return -1;
            }
            return s1.peek();
        }
        
    }
    public static void main(String args [])
    {
       Queue q = new Queue();
       q.push(1);
       q.push(2);
       q.push(3);
       q.push(4);
       q.push(5);

       while(!q.isEmpty())
       {
            System.out.println(q.peek());
            q.pop();
       }
    }
}

