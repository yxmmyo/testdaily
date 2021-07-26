package Tree_0726;

import java.util.ArrayList;
import java.util.Stack;

class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;
    TreeNode(int val) {
        this.val = val;
    }
}
public class Solution_0726 {
    //给定一个二叉树，返回该二叉树的之字形层序遍历，（第一层从左向右，下一层从右向左，一直这样交替）
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        if(pRoot == null) {
            return list;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(pRoot);
        while(!stack1.isEmpty() || !stack2.isEmpty()) {
            if(!stack1.isEmpty()) {
                ArrayList<Integer> tmp = new ArrayList<>();
                while(!stack1.isEmpty()) {
                    TreeNode node = stack1.pop();
                    tmp.add(node.val);
                    if(node.left != null) {
                        stack2.push(node.left);
                    }
                    if(node.right != null) {
                        stack2.push(node.right);
                    }
                }
                list.add(tmp);
            } else {
                ArrayList<Integer> tmp = new ArrayList<>();
                while(!stack2.isEmpty()) {
                    TreeNode node = stack2.pop();
                    tmp.add(node.val);
                    if(node.right != null) {
                        stack1.push(node.right);
                    }
                    if(node.left != null) {
                        stack1.push(node.left);
                    }
                }
                list.add(tmp);
            }
        }
        return list;
    }
}
