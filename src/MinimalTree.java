import java.util.Scanner;
import java.util.stream.IntStream;

// Given a sorted array with unique ints, wap to create BST with minimal height
public class MinimalTree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arLen = scan.nextInt();
        int[] ar = new int[arLen];

        IntStream.range(0, arLen).forEach( i -> {
            ar[i] = scan.nextInt();
        });

        Node root = formBST(ar, 0, arLen - 1);
        Tree t = new Tree();
        t.displayTree(root);
    }

    private static Node formBST(int[] ar, int start, int end) {
        if(end < start) {
            return null;
        }
        int mid = (start + end) / 2;
        Node root = new Node(ar[mid]);
        root.left = formBST(ar, 0, mid - 1);
        root.right = formBST(ar, mid + 1, end);
        return root;
    }
}
