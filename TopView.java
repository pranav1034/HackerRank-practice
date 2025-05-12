import java.util.*;
import java.io.*;

class Solution {
    static class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }
    public static void topView(Node root) {
        if (root == null) return;

        class Pair {
            Node node;
            int val;

            Pair(Node node, int val) {
                this.node = node;
                this.val = val;
            }
        }

        Queue<Pair> queue = new LinkedList<>();
        TreeMap<Integer, Integer> topViewMap = new TreeMap<>();

        queue.add(new Pair(root, 0));

        while (!queue.isEmpty()) {
            Pair current = queue.poll();
            Node node = current.node;
            int hd = current.val;

            if (!topViewMap.containsKey(hd)) {
                topViewMap.put(hd, node.data);
            }

            if (node.left != null) queue.add(new Pair(node.left, hd - 1));
            if (node.right != null) queue.add(new Pair(node.right, hd + 1));
        }

        for (int val : topViewMap.values()) {
            System.out.print(val + " ");
        }
    }


    public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
}