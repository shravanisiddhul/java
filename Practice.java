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
        public static Node buildtree(int nodes[])
        {
            idx++;
            if(nodes[idx] == -1)
            {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right= buildtree(nodes);

            return newNode;
        }
    }
    public static void preorder(Node root)
    {
        if(root == null)
        {
            System.out.print("-1"+" ");
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
            System.out.print("-1"+" ");
            return ;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void postorder(Node root)
    {
        if(root == null)
        {
            System.out.print("-1"+" ");
            return ;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
    public static void levelOrder(Node root)
    {
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
                }else{
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
    public static int countNodes(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);

        return leftNodes+rightNodes+1;
    }
    public static int SumOfNodes(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int leftSum = SumOfNodes(root.left);
        int rightSum = SumOfNodes(root.right);

        return leftSum+rightSum+root.data;
    }
    public static int height(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        int  maxHeight = Math.max(leftHeight, rightHeight)+1;
        return maxHeight;
    }
    public static int diameter(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        int dia1 = diameter(root.left);
        int dia2 = diameter(root.right);

        int dia3 = height(root.left)+height(root.right) + 1;

        return Math.max(dia1,Math.max(dia2, dia3));
    }

    // Case 2 
    static class TreeInfo
    {
        int height;
        int diam;

        TreeInfo(int height,int diam)
        {
            this.height = height;
            this.diam = diam;
        }
    }
    public static TreeInfo diameter2(Node root)
    {
        if(root == null)
        {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.height,right.height)+ 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.height+right.height+ 1;
        
        int mydiam = Math.max(Math.max(diam1, diam2), diam3);

        return new TreeInfo(myHeight, mydiam);
    }
    public static void main(String args [])
    {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root = BinaryTree.buildtree(nodes);
        System.out.println(root.data);
        System.out.println("Pre- Order Traversal is : ");
        preorder(root);
        System.out.println("\nIn-Order Traversal is : ");
        inorder(root);
        System.out.println("\nPost-Order Traversal is : ");
        postorder(root);
        System.out.println("\nLevel-Order Traversal is : ");
        levelOrder(root);
        System.out.println("\nNumber of Nodes are : "+countNodes(root));

        System.out.println("Sum of Nodes are : "+SumOfNodes(root));

        System.out.println("Height of tree is : "+height(root));

        System.out.println("Diameter of a Tree is : "+diameter(root));

        System.out.println("Diameter2 of tree is : "+diameter2(root).diam);
    }
}