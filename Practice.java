public class Practice
{
    Node head;

    class Node
    {
        int data ;
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
        head = head.next;
    }
    public void deletelast()
    {
        if(head == null)
        {
            System.out.println("List is Empty");
            return ;
        }
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
        list.deleteFirst();
        list.deletelast();
        list.printList();
    }
}