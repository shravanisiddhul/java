public class BST {
    static class Node{
        int data ;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static Node insert(Node root,int val)
    {
        if(root == null)
        {
            root = new Node(val);
            return root;
        }

        if(root.data > val)
        {
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }
    public static void inorder(Node root)
    {
        if(root == null)
        {
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static boolean search(Node root,int key)
    {
        if(root == null)
        {
            return false;
        }
        if(root.data > key)
        {
            return search(root.left, key);
        }else if (root.data == key)
        {
            return true;
        }else
        {
            return search(root.right, key);
        }
    }
    public static Node delete(Node root,int val)
    {
        if(root == null)
        {
            return null;
        }
        if(root.data > val)
        {
            root.left = delete(root.left, val);
        }else if (root.data < val)
        {
            root.right = delete(root.right, val);
        }else
        {
            // case 1 
            if(root.left == null && root.right == null)
            {
                return null;
            }

            // case 2 
            if(root.left == null)
            {
                return root.right;
            }else if(root.right == null)
            {
                return root.left;
            }
            
            // case 3
            Node IS = inorderSuccesor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }
    public static Node inorderSuccesor(Node root)
    {
        while(root.right != null)
        {
            return root.right;
        }
        return root;
    }
    public static void printInRange(Node root,int x ,int y)
    {
        if(root == null)
        {
            return ;
        }
        if(root.data >= x && root.data <= y)
        {
            printInRange(root.left, x, y);
            System.out.print(root.data+" ");
            printInRange(root.right, x, y);
            
        }else if (root.data >=y)
        {
            printInRange(root.left, x, y);
        }else{
            printInRange(root.right, x, y);
        }
        
    }

    public static void main(String args [])
    {
        int x = 6,y =10;
        int values[] = {8 ,5, 3, 1, 4, 6,10, 11, 14};
        Node root = null;

        for(int i=0; i<values.length ; i++ )
        {
            root = insert(root, values[i]);
        }
        inorder(root);
        System.out.println();

        if(search(root, 5))
        {
            System.out.println("Found");
        }else{
            System.out.println("Not found");
        }

        delete(root, 5);
        inorder(root);
        System.out.println("\nNumbers in range of "+x+ " to "+y+" are : ");
        printInRange(root, 6, 10);
    }
}
