class Practice
{
    Node head;
    private int size;

    Practice()
    {
        this.size = 0;
    }
    public class Node
    {
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
            return ;
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
            return ;
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
            System.out.println("List is empty");
            return ;
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
            return ;
        }
        size--;
        head = head.next;
    }
    public void deleteLast()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return ;
        }
        size--;
        if(head.next == null)
        {
            return ;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null)
        {
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }
        secondLast.next = null;
    }
    public int size()
    {
        return size;
    }
    public void reverseIterate()
    {
        if(head == null)
        {
            return ;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null)
        {
            Node lastNode = currNode.next;
            currNode.next = prevNode;
            
            prevNode = currNode;
            currNode = lastNode;
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
        Practice.Node newHead = reverseRecursive(head.next);
        head.next.next = head ;
        head.next = null;
        return newHead;
    }

    public static void main(String args [])
    {
        Practice list = new Practice();
        list.addFirst(1);
        list.addLast(2);
        list.addLast(3);
        list.addFirst(0);
        list.addLast(4);
        list.addLast(5);
        list.printList();
        list.deleteFirst();
        list.deleteLast();
        list.printList();

        System.out.println(list.size());

        list.reverseIterate();
        list.printList();

        list.head = list.reverseRecursive(list.head);
        list.printList();
        
        System.out.println(list.size());
    }

}