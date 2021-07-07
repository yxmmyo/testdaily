class TreeNode {
    TreeNode left;
    TreeNode right;
    int val;
    TreeNode(int val) {
        this.val = val;
    }
}
public class Solution_0707 {
    //判断是否为平衡二叉树
    public int treeHigh(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = treeHigh(root.left);
        int right = treeHigh(root.right);
        return Math.max(left,right)+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null){
            return true;
        }
        boolean is = Math.abs(treeHigh(root.left)-treeHigh(root.right)) <= 1;
        boolean isLeft = isBalanced(root.left);
        boolean isRight = isBalanced(root.right);
        return is && isLeft && isRight;
    }
}
