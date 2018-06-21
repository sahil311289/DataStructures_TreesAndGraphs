import java.util.*;

public class ListOfDepthsRecursive {
    public static void main(String[] args) {
        Tree t = new Tree();
        Node root = t.createTree();

        List<List<Node>> list = new ArrayList<>();
        Node root2 = createListOfNodes(root, 0, list);
        t.displayTree(root2);
    }

    static Node createListOfNodes(Node root, int level, List<List<Node>> list) {
        if(root == null) {
            return null;
        }

        List<Node> ll = null;
        if(list.size() > level) {
            ll = list.get(level);
        }
        else {
            ll = new LinkedList<>();
        }
        ll.add(root);
        list.add(ll);

        if(root.left != null) {
            createListOfNodes(root.left, level + 1, list);
        }
        if(root.right != null) {
            createListOfNodes(root.right, level + 1, list);
        }

        return root;
    }
}
