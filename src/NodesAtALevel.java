import java.util.Scanner;

public class NodesAtALevel {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = tree.createTree();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the level of the tree to print nodes:");
        int level = scan.nextInt();

        System.out.println();
        printAllNodesAtLevel(root, 0, level);
    }

    static void printAllNodesAtLevel(Node root, int currentLevel, int givenLevel) {
        if(root == null) {
            return;
        }
        if(currentLevel == givenLevel) {
            System.out.print(root.data + " ");
        }
        if(root.left!= null) {
            printAllNodesAtLevel(root.left, currentLevel + 1, givenLevel);
        }
        if(root.right!= null) {
            printAllNodesAtLevel(root.right, currentLevel + 1, givenLevel);
        }
    }
}
