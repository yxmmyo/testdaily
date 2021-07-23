import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TreeNode {
    char val;
    TreeNode left;
    TreeNode right;
    TreeNode(char val) {
        this.val =  val;
    }
}

public class Solution_0723 {
    public static TreeNode buildTree(List<Character> in, List<Character> out) {
        if (in.isEmpty()) {
            return null;
        }
        char rootVal = in.remove(0);
        if (rootVal == '#') {
            out.addAll(in);
            return null;
        }
        TreeNode root = new TreeNode(rootVal);
        List<Character> rightOut = new ArrayList<>();
        TreeNode left = buildTree(in,rightOut);
        TreeNode right = buildTree(rightOut,out);
        root.left = left;
        root.right = right;
        return root;
    }

    public static List<Character> stringToList(String s) {
        List<Character> list = new ArrayList<>();
        for (char c:s.toCharArray()
             ) {
            list.add(c);
        }
        return list;
    }

    public static void inOrder(TreeNode root) {
        if (root != null) {
            inOrder(root.left);
            System.out.printf("%c ",root.val);
            inOrder((root.right));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<Character> in = stringToList(s);
        List<Character> out = new ArrayList<>();
        TreeNode root = buildTree(in,out);
        inOrder(root);
    }
}
