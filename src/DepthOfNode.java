public class DepthOfNode {
    public static void main(String[] args) {
        Tree t = new Tree();
        Node root = t.createTree();

        depthOfNode(root, 5, 0);
    }

    private static void depthOfNode(Node root, int key, int depth) {
        if(root == null) {
            return;
        }
        root.depth = depth;
        if(root.data == key) {
            System.out.println(depth);
        }
        depthOfNode(root.left, key, depth + 1);
        depthOfNode(root.right, key, depth + 1);
    }
}
