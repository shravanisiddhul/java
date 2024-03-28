// import LL.Node;

public class BinaryTree {
    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class binaryTree
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
            newNode.right = buildtree(nodes);

            return newNode;
        }
    }
    public static void main(String args [])
    {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // BinaryTree tree = new BinaryTree();
        Node root = binaryTree.buildtree(nodes);
        System.out.println(root.data);
    }
    
}
