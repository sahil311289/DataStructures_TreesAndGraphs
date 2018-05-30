/*
            1
      2            3
   4     5      6     7

 Expected o/p = 4 5 6 7 2 3 1
 */


import java.util.*;

public class ReverseLevelOrderTraversal {
    public static void main(String[] args) {
        Tree t = new Tree();
        Node n = t.createTree();

        reverseLevelOrderTraversal(n);
    }

    private static void reverseLevelOrderTraversal(Node root) {
        Stack<Node> stack = new Stack<>();
        Queue<Node> q = new LinkedList<>();

        Node temp = root;
        stack.push(temp);
        q.add(temp);

        while (!q.isEmpty()) {
            temp = q.remove();
            if (temp.right != null) {
                stack.push(temp.right);
                q.add(temp.right);

            }
            if (temp.left != null) {
                stack.push(temp.left);
                q.add(temp.left);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop().data + " ");
        }
    }
}
