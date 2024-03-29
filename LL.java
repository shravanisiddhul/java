class LL{

    Node head;
    private int size;

    LL()
    {
        this.size = 0;
    }
    class Node{
        String data;
        Node next;

        Node(String data)
        {
            this.data = data;
            this.next = null;
            size++;
        }
    }
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
    public static void main(String args [])
    {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("list");
        list.printList();

        list.addFirst("This");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deletelast();
        list.printList();

        int size = list.getsize();
        System.out.println(size);
    }
}
