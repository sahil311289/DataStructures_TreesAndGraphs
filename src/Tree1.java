
import java.util.*;

class Node1 {
    int data;
    Node1 left;
    Node1 right;
    public Node1(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Tree1 {
    public static void main(String[] args) {
        Node1 root = new Node1(1);
        root.left = new Node1(2);
        root.right = new Node1(3);
        root.left.left = new Node1(4);
        root.left.right = new Node1(5);

        printTree(root);
    }
    static void printTree(Node1 root) {
        if(root == null) {
            return;
        }
        Queue<Node1> q = new LinkedList<>();
        q.add(root);
        System.out.print(root.data);
        while(!q.isEmpty()) {
            System.out.println();
            Node1 n = q.remove();
            if(n.left != null) {
                q.add(n.left);
                System.out.print(n.left.data);
            }
            if(n.right != null) {
                q.add(n.right);
                System.out.print(n.right.data);
            }
        }
    }
}