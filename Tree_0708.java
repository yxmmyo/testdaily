class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
    }
}
public class Tree_0708 {
    public boolean containsNode(TreeNode root,TreeNode toSeacrh) {
        if (root == null) {
            return false;
        }
        if (root == toSeacrh) {
            return true;
        }
        boolean leftTree = containsNode(root.left,toSeacrh);
        if (leftTree) {
            return true;
        }
        return  containsNode(root.right,toSeacrh);
    }
}
