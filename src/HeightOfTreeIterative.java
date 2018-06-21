import java.util.LinkedList;
import java.util.Queue;

public class HeightOfTreeIterative {
    public static void main(String[] args) {
        Tree t = new Tree();
        Node root = t.createTree2();

        System.out.println(findHeight(root));
    }

    private static int findHeight(Node root) {
        int count = 0;
        Queue<Node> q = new LinkedList<>();
        int height = 0;

        ((LinkedList<Node>) q).add(root);

        while(1==1) {
            count = q.size();
            if(count == 0) {
                return height;
            }

            while(count != 0) {
                Node removed = q.remove();
                if(removed.left != null) {
                    ((LinkedList<Node>) q).add(removed.left);
                }
                if(removed.right != null) {
                    ((LinkedList<Node>) q).add(removed.right);
                }
                count--;
            }
        }
    }
}
