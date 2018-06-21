
/*
Half node is where a node has only 1 child.
 */

import java.util.LinkedList;
import java.util.Queue;

public class CountHafNodesInBinaryTree {
    public static void main(String[] args) {

        String x = "abc";
        String y = new String("abc");
        System.out.println(x == y);

//        if(root == null) {
//            return;
//        }

        Tree t = new Tree();
        Node n = t.createTree2();

        countHalfNodes(n);
    }

    public int divide(int a, int b) {
        int c = -1;
        try {
            c = a / b;
        }
        catch (Exception e) {
            System.err.print("Exception ");
        }
        finally {
            System.err.print("Finally ");
        }
        return c;
    }

    private static void countHalfNodes(Node root) {
        String x = "abc";
        String y = new String("abc");
        System.out.println(x == y);

        if(root == null) {
            return;
        }
        int count = 0;
        Node current = root;
        Queue<Node> q = new LinkedList<>();

        q.add(current);

        while(!q.isEmpty()) {
            Node removed = q.remove();

        }
    }
}
