public class Practice
{
    Node head;
    private int size;


    Practice()
    {
        this.size = 0;
    }
    class Node
    {
        int data ;
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
        newNode.next = head ;
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
            System.out.println("List is Empty");
            return ;
        }
        Node currNode = head;
        while(currNode!= null)
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
            System.out.println("List is Empty");
            return ;
        }
        size--;
        head = head.next;
    }
    public void deletelast()
    {
        if(head == null)
        {
            System.out.println("List is Empty");
            return ;
        }
        size--;
        if(head.next == null)
        {
            head = null;
            return ;
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
    public int size()
    {
        return size;
    }
    public void reverseIterative()
    {
        if(head == null || head.next == null)
        {
            return ;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null)
        {
            Node nextNode = currNode.next ;
            currNode.next = prevNode;

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
        Node newHead = reverseRecursive(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
    public static void main(String args[])
    {
        Practice list = new Practice();
        list.addFirst(2);
        list.addLast(3);
        list.addFirst(1);
        list.addLast(4);
        list.addFirst(0);
        list.addLast(5);
        list.printList();
        System.out.println(list.size());
        list.deleteFirst();
        list.deletelast();
        list.printList();
        System.out.println(list.size());
        list.reverseIterative();
        list.printList();
        list.head = list.reverseRecursive(list.head);
        list.printList();
    }
}