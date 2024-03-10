class Practice
{
	Node head;

	public class Node{
		String data;
		Node next;

		Node(String data)
		{
			this.data = data;
			this.next = null;
		}
	}
	public void addfirst(String data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
			return;
		}
		head = newNode.next;
		newNode = head;
	}
	public void addLast(String data)
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
			currNode= currNode.next;
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
	public static void main(String args[])
	{
		Practice list = new Practice();
		list.addfirst("1");
		list.addLast("2");
		list.addLast("3");
		list.printList();
	}
}