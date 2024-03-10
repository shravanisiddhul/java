import javax.sound.sampled.LineListener;

class Practice
{
	Node head;

	public class Node
	{
		String data;
		Node next;
		
		// Add First
		public void addFirst(String data)
		{
			Node newNode = new Node();
			if(head == null)
			{
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
		}

		// Add last 
		public void addLast(String data)
		{
			Node newNode = new Node();
			if(head == null)
			{
				head = newNode;
				return;
			}
			Node currNode = new Node();
			while(currNode.next != null)
			{
				currNode = currNode.next;
			}
			currNode.next = newNode;
		}

		public void printList()
		{
			if(head == null)
			{
				System.out.println("List is Empty");
			}
			Node currNode = new Node();
			while(currNode != null)
			{
				System.out.println(currNode+" -> ");
				currNode = currNode.next;
			}
			System.out.println("Null");

		}
	}
	public static void main(String args [])
	{
		LL list = new LL();
		list.addFirst("M");
		list.addFirst("I");
		list.addFirst("K");
	
		list.addLast("T");
		list.addLast("A");
		list.addLast("E");
		list.addLast("H");
		list.addLast("Y");
		list.addLast("U");
		list.addLast("N");
		list.addLast("G");
		list.printList();


	}
}