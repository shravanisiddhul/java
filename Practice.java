class Practice
{
	Node head;
	public class Node
	{
		String data;
		Node next;

		Node(String data)
		{
			this.data = data;
			this.next = null;
		}
	}

	// Add first
	public void addFirst(String data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode.next;
		}
		newNode.next = head;
		head = newNode;
	}

	// Add last
	public void addLast(String data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode.next;
		}
		Node currNode = head;
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
		Node currNode = head;
		while(currNode != null)
		{
			System.out.print(currNode.data+" -> ");
			currNode = currNode.next;
		}
		System.out.println("Null");
	}
	// delete first
	public void deleteFirst()
	{
		if(head == null)
		{
			System.out.println("List is Empty");
			return ;
		}
		head = head.next;
		
	}

	// delete last
	public void deleteLast()
	{
		if(head == null)
		{
			System.out.println("List is Empty");
			return;
		}
		if(head.next == null)
		{
			head = null;
			return;
		}
		Node secondLast = head;
		Node lastNode = head.next;
		while(lastNode.next != null)
		{
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}

	public static void main(String args [])
	{
		Practice list = new Practice();
		list.addFirst("1");
		list.addFirst("0");
		list.addLast("2");
		list.addLast("3");
		list.addLast("4");
		list.printList();

		list.deleteFirst();
		list.deleteLast();
		list.printList();

	}
}