public class Solution2_0707 {
    //判断是否为对称二叉树
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return panDuan(root,root);
    }
    public boolean panDuan(TreeNode left,TreeNode right) {
        if(left == null && right == null) {
            return true;
        }
        if(left != null && right == null) {
            return false;
        }
        if(left == null && right != null) {
            return false;
        }
        boolean is = left.val == right.val;
        boolean left1 = panDuan(left.left,right.right);
        boolean right1 = panDuan(left.right,right.left);
        return is && left1 && right1;

    }
}
