import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class PostorderTraversalWithoutRecursion {
    public static void main(String[] args) {
        Tree t = new Tree();
        Node n = t.createTree();

        postorderTraversalWithoutRecursion(n);
    }

    private static void postorderTraversalWithoutRecursion(Node root) {
        Stack<Node> stack = new Stack();
        Node current = root;
        Set<Node> set = new HashSet<>();

        while(!stack.isEmpty() || current != null) {
            while(current != null) {
                if(!set.contains(current)) {
                    stack.push(current);
                    set.add(current);
                }
                current = current.left;
            }

            System.out.println(stack.pop().data);
            if(stack.size() > 0 && !set.contains(stack.peek().right)) {
                current = stack.peek().right;
            }
        }
    }
}
