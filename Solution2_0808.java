public class Solution2_0808 {
    //求二叉树的最大深度
    public int maxDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right)+1;
    }
    //判断是否为对称二叉树
    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }
        return isMirrorTree(root.left,root.right);

    }
    public boolean isMirrorTree(TreeNode p,TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        if(p == null || q == null) {
            return false;
        }
        return p.val == q.val
                && isMirrorTree(p.left,q.right)
                && isMirrorTree(p.right,q.left);
    }
}
