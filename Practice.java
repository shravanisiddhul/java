import java.util.LinkedList;
import java.util.Queue;
public class Practice
{
    static class Node
    {
        int data;
        Node left ;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }
    static class BinaryTree
    {
        static int idx = -1;
        public static Node buildTree(int nodes[])
        {
            idx++;
            if(nodes[idx] == -1)
            {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            
            return newNode;
        }
    }
    public static void preorder(Node root)
    {
        if(root == null)
        {
            System.out.print("");
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void inorder(Node root)
    {
        if(root == null)
        {
            System.out.print("");
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root)
    {
        if(root == null)
        {
            System.out.print("");
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelOrder(Node root)
    {
        if(root == null)
        {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty())
        {
            Node currNode = q.remove();
            if(currNode == null)
            {
                System.out.println();
                if(q.isEmpty())
                {
                    break;
                }
                else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left != null)
                {
                    q.add(currNode.left);
                }
                if(currNode.right != null)
                {
                    q.add(currNode.right);
                }
            }
        }
    }
    public static int countNode(Node root)
    {
        if(root == null)
        {
            return 0 ;
        }
        int leftNode = countNode(root.left);
        int rightNode = countNode(root.right);

        return leftNode+rightNode+1;
    }
    public static int SumOfNodes(Node root)
    {
        if(root == null)
        {
            return 0 ;
        }
        int leftSum = SumOfNodes(root.left);
        int rightSum = SumOfNodes(root.right);

        return leftSum+rightSum+root.data;
    }
    public static int Height(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int leftHeight = Height(root.left);
        int rightHeight = Height(root.right);

        int maxHeight = Math.max(leftHeight, rightHeight)+1;
        return maxHeight;
    }
    public static void main(String args [])
    {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = BinaryTree.buildTree(nodes);
        System.out.println(root.data);
        System.out.println("Pre-Order traversal is : ");
        preorder(root);
        System.out.println("\nIn- Order traversal is : ");
        inorder(root);
        System.out.println("\nPost-Order traversal is : ");
        postorder(root);
        System.out.println("\nLevelOrder traversal is : ");
        levelOrder(root);

        System.out.println("Count of Nodes in a tree : "+countNode(root));

        System.out.println("Sum of Node are : "+SumOfNodes(root));

        System.out.println("Height of  a Tree is : "+Height(root));
    }
}