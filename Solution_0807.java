import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;
    TreeNode(int val) {
        this.val  = val;
    }
}
public class Solution_0807 {
    List<Integer> list1 = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) {
            return list1;
        }
        list1.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return list1;
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Deque<TreeNode> stack = new LinkedList<>();
        TreeNode cur = root;
        while(!stack.isEmpty() || cur != null) {
            while(cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode top = stack.pop();
            list.add(top.val);
            cur = top.right;

        }
        return list;
    }

    List<Integer> list = new LinkedList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null) {
            return list;
        }else {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            list.add(root.val);
        }
        return list;
    }
}
