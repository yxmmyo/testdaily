package Tree;

import java.util.LinkedList;
import java.util.List;

class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;
    TreeNode(int val) {
        this.val = val;
    }
}
public class Solution2_0724 {
    //给定一个二叉树的根节点root，返回它的中序遍历。
    public int[] inorderTraversal (TreeNode root) {
        // write code here
        List<Integer> list = inOrder(root);
        int[] ary = new int[list.size()];
        for(int i = 0;i < ary.length;i++) {
            ary[i] = list.remove(0);
        }
        return ary;
    }
    List<Integer> list = new LinkedList<>();
    public List<Integer> inOrder(TreeNode root) {
        if(root == null) {
            return list;
        }
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
        return list;
    }
}
