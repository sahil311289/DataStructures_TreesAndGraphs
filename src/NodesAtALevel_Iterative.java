import java.util.Queue;
import java.util.LinkedList;

public class NodesAtALevel_Iterative {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = tree.createTree();

        displayNodesAtALevel(root, 1);
    }

    private static void displayNodesAtALevel(Node root, int level) {
        if(root == null || level < 0) {
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int currentLevel = -1;

        while(!q.isEmpty()) {
            Node removed = q.remove();

            currentLevel++;
            if(currentLevel == level) {
                System.out.println(removed.data);
            }

            if(removed.left != null) {
                q.add(removed.left);
            }
            if(removed.right != null) {
                q.add(removed.right);
            }
        }
    }
}
