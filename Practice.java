class Practice{
	Node head;
	class Node{
		String data;
		Node next;

		Node(String data)
		{
			this.data = data;
			this.next = null;
		}

		// Add fist 
		public void addFirst(String data)
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

		// Add Last 
		public  void addLast(String data)
		{
			Node newNode = new Node(data);
			if(head == null)
			{
				head = newNode;
				return;
			} 
			Node currNode = new Node(data);
			while(currNode.next != null)
			{
				currNode = currNode.next;
			}
			currNode.next = newNode;

			// Print

		}
		public void printList()
		{
			if(head == null)
			{
				System.out.println("List is Empty");
			}
			Node currNode = new Node(data);
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
		list.addFirst("2");
		list.addFirst("1");
		list.printList();

		list.addLast("3");
		list.addLast("4");
		list.printList();

		list.addFirst("0");
		list.printList();
	}
}