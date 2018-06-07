public class CheckBalancedBT {
    public static void main(String[] args) {
        Tree t = new Tree();
        Node root = t.createTree();

        System.out.println(checkBTBalanced(root) != Integer.MIN_VALUE);
    }

    private static int checkBTBalanced(Node root) {
        if(root == null) {
            return 0;
        }

        int leftHeight = checkBTBalanced(root.left);
        if(leftHeight == Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        int rightHeight = checkBTBalanced(root.right);
        if(rightHeight == Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        if(Math.abs(leftHeight - rightHeight) > 1) {
            return Integer.MIN_VALUE;
        } else {
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }
}
