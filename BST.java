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
    public static void preorder(Node root)
    {
        if(root == null)
        {
            return ;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void postorder(Node root)
    {
        if(root == null)
        {
            return ;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String args [])
    {
        int values[] = {5,1,4,3,2,7};
        Node root = null;

        for(int i=0; i<values.length ; i++ )
        {
            root = insert(root, values[i]);
        }
        postorder(root);
        System.out.println();
    }
}
