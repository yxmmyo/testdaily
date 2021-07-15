import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;
    TreeNode(int val) {
        this.val = val;
    }
}
public class Solution_0715 {
    class NL {
        TreeNode node;
        int level;
        NL(TreeNode node,int level) {
            this.node = node;
            this.level = level;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Queue<NL> queue = new LinkedList<>();
        queue.add(new NL(root,0));
        while (!queue.isEmpty()) {
            NL nl = queue.remove();
            TreeNode node = nl.node;
            int level = nl.level;
            if (list.size() == level) {
                list.add(new ArrayList<>());
            }
            List<Integer> inList = list.get(level);
            inList.add(node.val);
            if (node.left != null) {
                queue.add(new NL(node.left,level+1));
            }
            if (node.right != null) {
                queue.add(new NL(node.right,level+1));
            }
        }
        return list;
    }
}
