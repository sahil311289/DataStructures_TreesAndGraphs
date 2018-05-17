import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Traversal {
    public static void main(String[] args) {
        Tree root = new Tree();
        Node n = root.createTree();

        System.out.println("DFS: PreOrder traversal (recursive): ");
        preOrder(n);

        System.out.println("\nDFS: PostOrder traversal (recursive): ");
        postOrder(n);

        System.out.println("\nDFS: InOrder traversal (recursive): ");
        inOrder(n);

        System.out.println("\nDFS traversal with Stack: ");
        dfs(n);

        System.out.println("\nBFS traversal with Queue: ");
        bfs(n);
    }

    static void preOrder(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.data + " ");
        if(root.left != null) {
            preOrder(root.left);
        }
        if(root.right != null) {
            preOrder(root.right);
        }
    }

    static void postOrder(Node root) {
        if(root == null) {
            return;
        }
        if(root.left != null) {
            postOrder(root.left);
        }
        if(root.right != null) {
            postOrder(root.right);
        }
        System.out.print(root.data + " ");
    }

    static void inOrder(Node root) {
        if(root == null) {
            return;
        }
        if(root.left != null) {
            inOrder(root.left);
        }
        System.out.print(root.data + " ");
        if(root.right != null) {
            inOrder(root.right);
        }
    }

    static void dfs(Node root) {
        Stack<Node> st = new Stack<>();
        st.push(root);

        while(!st.isEmpty()) {
            Node popped = st.pop();
            System.out.print(popped.data + " ");
            if(popped.right != null) {
                st.push(popped.right);
            }
            if(popped.left != null) {
                st.push(popped.left);
            }
        }
    }

    static void bfs(Node root) {
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            Node removed = q.remove();
            System.out.print(removed.data + " ");
            if(removed.left != null) {
                q.add(removed.left);
            }
            if(removed.right != null) {
                q.add(removed.right);
            }
        }
    }
}
