import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Trie_Contacts {
    static class Node {
        char c;
        List<Node> children;
        public Node(char c) {
            this.c = c;
            children = new ArrayList<>();
        }
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        Node root = new Node('*');

        for (int nItr = 0; nItr < n; nItr++) {
            String[] opContact = scanner.nextLine().split(" ");
            String op = opContact[0];
            String contact = opContact[1];
            switch(op) {
                case "add":
                    add(root, contact);
                    break;
                case "find":
                find(root, contact);
                break;
            }
        }
        scanner.close();
    }

    private static void add(Node root, String contact) {
        char[] ar = contact.toCharArray();
        int i = 0;

        if(root.children.size() == 0) {
            Node temp = root;
            while(i<ar.length) {
                Node temp2 = new Node(ar[i]);
                temp.children.add(temp2);
                temp = temp.children.get(0);
                i++;
            }
        } else {
            Queue<Node> q = new LinkedList<>();
            ((LinkedList<Node>) q).add(root);
            while(!q.isEmpty()) {
                Node removed = q.remove();
                if(removed.c == ar[i]) {
                    Node temp = removed;
                }
                for (Node n: removed.children) {
                    ((LinkedList<Node>) q).add(n);
                }

            }
        }
    }

    private static void find(Node root, String contact) {

    }
}
