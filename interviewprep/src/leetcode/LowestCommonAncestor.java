package leetcode;

public class LowestCommonAncestor {
    public static Node LCAIterative(Node root, int n1, int n2) {
        if (root == null) return null;

        if (root.data > n1 && root.data > n2)
            return LCAIterative(root.left, n1, n2);
        else if (root.data <= n1 && root.data < n2)
            return LCAIterative(root.right, n1, n2);

        return root;
    }


    public static Node LCARecursive(Node root, int n1, int n2) {
        return null;
    }

    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        Node n1 = new Node(5);
        root.left.left = n1;
        root.left.right = new Node(13);
        Node n2 = new Node(14);
        root.left.right.right = n2;
        root.left.right.left = new Node(12);

        LowestCommonAncestor i = new LowestCommonAncestor();
        System.out.println("Recursive-Lowest Common Ancestor of Nodes " + n1.data + " and " + n2.data + " is : "
                + i.LCAIterative(root, 5, 14).data);

        Node x = i.LCARecursive(root, 5, 14);
        System.out.println(
                "Iterative-Lowest Common Ancestor of Nodes " + n1.data + " and " + n2.data + " is : " + x.data);

    }

}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}