public class HeightOfTreeRecursive {
    public static void main(String[] args) {
        Tree t = new Tree();
        Node root = t.createTree2();

        System.out.println(checkHeight(root));
    }

    private static int checkHeight(Node root) {
        if(root == null) {
            return 0;
        }

        int leftHeight = checkHeight(root.left);
        int rightHeight = checkHeight(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
