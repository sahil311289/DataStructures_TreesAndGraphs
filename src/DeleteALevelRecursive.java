public class DeleteALevelRecursive {
    public static void main(String[] args) {
        Tree t = new Tree();
        Node root = t.createTree2();
        Node root2 = new Node(root.data);
        root2 = deleteRecursive(root, 0, 2, root2);
        t.displayTree(root2);
    }

    private static Node deleteRecursive(Node root, int currentLevel, int delLevel, Node root2) {
        if(root == null) {
            return root;
        }
        if(currentLevel != delLevel) {
            if(root.left != null) {
                root2.left = deleteRecursive(root.left, currentLevel + 1, delLevel, root2);
            }
            if(root.right != null) {
                root2.right = deleteRecursive(root.right, currentLevel + 1, delLevel, root2);
            }
        }
        return root2;
    }
}
