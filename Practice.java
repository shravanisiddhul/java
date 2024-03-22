public class Practice
{
	Node head;
	static class Node
	{
		int data ;
		Node next;

		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	static class stack{
		public static Node head;
		public boolean isEmpty()
		{
			return head == null;
		}
		public void push(int data)
		{
			Node newN = new Node(data);
			if(isEmpty())
			{
				head = newN;
				return ;
			}
			newN.next = head;
			head = newN;

		}
		public int pop()
		{
			if(isEmpty())
			{
				return -1;
			}
			int top = head.data;
			head = head.next;
			return top;
		}
		public int peek()
		{
			if(isEmpty())
			{
				return -1;
			}
			return head.data;
		}
	}
	public static void main(String args [])
	{
		stack s = new stack();
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);

		while(!s.isEmpty())
		{
			System.out.println(s.peek());
			s.pop();
		}
	}
}