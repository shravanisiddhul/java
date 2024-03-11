
class ReverseLL{

    Node head;
    private int size;

    ReverseLL()
    {
        this.size = 0;
    }
    class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
            size++;
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
            System.out.print(currNode.data + " -> ");
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
        size--;
        head = head.next;
    }

    // delete last
    public void deletelast()
    {
        if(head == null)
        {
            System.out.println("List is Empty");
            return;
        }
        size--;
        if(head.next == null)
        {
            head = null;
            return;
        }

        Node secondlast = head;
        Node lastNode = head.next;
        while(lastNode.next != null)
        {
            lastNode = lastNode.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    public int getsize()
    {
        return size;
    }

   public void reverseIterate()
   {
    if(head == null || head.next == null)
    {
        return ;
    }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode !=null)
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
   public Node reverseRecursive(Node head)
   {
    if(head == null || head.next == null)
    {
        return head;
    }
        Node newHead = reverseRecursive( head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
   }

    public static void main(String args [])
    {
        ReverseLL list = new ReverseLL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.printList();

        list.reverseIterate();
        list.printList();

        list.head = list.reverseRecursive(list.head);
        list.printList();
    }
}
