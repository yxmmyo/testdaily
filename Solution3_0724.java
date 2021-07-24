package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution3_0724 {
    //分别按照二叉树先序，中序和后序打印所有的节点。
    public int[][] threeOrders (TreeNode root) {
        // write code here
        List<Integer> preList = preOrder(root);
        List<Integer> inList = inOrder(root);
        List<Integer> lastList = lastOrder(root);
        int[][] ary = new int[3][inList.size()];
        for(int i = 0;i < ary[0].length;i++) {
            ary[0][i] = preList.remove(0);
        }
        for(int j = 0;j < ary[1].length;j++) {
            ary[1][j] = inList.remove(0);
        }
        for(int k = 0;k < ary[2].length;k++) {
            ary[2][k] = lastList.remove(0);
        }
        return ary;
    }
    List<Integer> preList = new LinkedList<>();
    public List<Integer> preOrder(TreeNode root) {
        if(root == null) {
            return preList;
        }
        preList.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
        return preList;
    }
    List<Integer> inList = new LinkedList<>();
    public List<Integer> inOrder(TreeNode root) {
        if(root == null) {
            return inList;
        }
        inOrder(root.left);
        inList.add(root.val);
        inOrder(root.right);
        return inList;
    }
    List<Integer> lastList = new LinkedList<>();
    public List<Integer> lastOrder(TreeNode root) {
        if(root == null) {
            return lastList;
        }
        lastOrder(root.left);
        lastOrder(root.right);
        lastList.add(root.val);
        return lastList;
    }

    public static void main(String[] args) {
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode ndoe = queue.remove();
    }
}
