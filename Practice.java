class practice
{
	Node head;
	public class Node{
		int data;
		Node next;

		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	public void addFirst(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	public void addLast(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			return;
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
	public void deleteFirst()
	{
		if(head == null)
		{
			System.out.println("List is empty");
			return;
		}
		head = head.next ;
	}
	public void deleteLast()
	{
		if(head == null)
		{
			System.out.println("list is empty");
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
	public void reverseIterate()
	{
		if(head == null || head.next == null)
		{
			return;
		}
		Node prevNode = head;
		Node currNode = head.next;
		while(currNode != null)
		{
			Node nextNode = currNode.next;
			currNode.next = prevNode;

			// update
			prevNode = currNode;
			currNode = nextNode;
		}
		head.next = null;
		head = prevNode;
	}


	public static void main(String args[])
	{
		practice list = new practice();
		list.addFirst(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
		list.printList();

		list.deleteFirst();
		list.deleteLast();
		list.printList();

		list.reverseIterate();
		list.printList();
	}
	
}