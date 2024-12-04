import java.util.*;

public class topViewBinaryTree {

      class Node {
        int data;
        Node left;
        Node right;
        public Node() {
          data = 0;
        }
        public Node(int d)  {
          data = d;
       }
     }
    class Result {
        static TreeMap<Integer, Vector<Integer>> columnMap = new TreeMap<>();

        static void preOrder(Node root, int column) {
            if (root == null) return;

            columnMap.computeIfAbsent(column, k -> new Vector<>()).add(root.data);

            preOrder(root.left, column - 1);

            preOrder(root.right, column + 1);
        }
        static void printTopView(Node root) {
            preOrder(root, 0);
            for(Map.Entry<Integer,Vector<Integer>> entry:columnMap.entrySet()){
                System.out.print(entry.getValue().firstElement() + " ");
            }
        }
    }
}

