import java.util.Stack;

/*
Assign current to the root node.
Initialize an empty stack.
Repeat while either the stack is empty or current node is null:
1. Until current is null, keep adding it to the stack. Assign current to left of current.
2. If left is null, assign the current to popped node.
3. Display the popped node
4. If popped node's right != null, assign current to current.right
*/


public class InorderTraversalWithoutRecursion {
    public static void main(String[] args) {
        Tree t = new Tree();
        Node n = t.createTree();

        inorderTraversalWithoutRecursion(n);
    }

    private static void inorderTraversalWithoutRecursion(Node root) {
        Stack<Node> stack = new Stack<>();
        Node current = root;

        while(!stack.isEmpty() || current != null) {
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.println(current.data);
            if(current != null) {
                current = current.right;
            }
        }
    }
}
