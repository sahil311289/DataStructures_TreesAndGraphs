import java.util.Stack;

public class PreorderTraversalWithoutRecursion {
    public static void main(String[] args) {
        Tree t = new Tree();
        Node n = t.createTree();

        preorderTraversalWithoutRecursion(n);
    }

    private static void preorderTraversalWithoutRecursion(Node root) {
        Stack<Node> stack = new Stack<>();
        Node current = root;
        stack.push(current);

        while(!stack.isEmpty()) {
            current = stack.pop();
            System.out.println(current.data);

            if(current.right != null) {
                stack.push(current.right);
            }

            if(current.left != null) {
                stack.push(current.left);
            }
        }
    }
}
