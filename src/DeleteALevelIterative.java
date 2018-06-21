import java.util.Scanner;

public class DeleteALevelIterative {
    public static void main(String[] args) {
        Tree t = new Tree();
        Node root = t.createTree2();

        Scanner scanner = new Scanner(System.in);
        int level = scanner.nextInt();

        root = deleteLevelIterative(root);
        t.displayTree(root);
    }

    private static Node deleteLevelIterative(Node root) {
        if(root == null) {
            return root;
        }



        return null;
    }
}
