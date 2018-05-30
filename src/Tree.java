import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;

    public Node() {
        left = right = null;
    }

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Tree {
    static Node root = null;

    public Node createTree() {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        return root;
    }

    public void displayTree(Node root) {
        if(root == null) {
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            Node del = q.remove();
            System.out.println(del.data);
            if(del.left != null) {
                q.add(del.left);
            }
            if(del.right != null) {
                q.add(del.right);
            }
        }
    }
}
