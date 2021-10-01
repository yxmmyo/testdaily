import java.util.LinkedList;
import java.util.List;

 class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
public class Solution_1001 {

    //JZ57 二叉树的下一个结点
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if(pNode == null) {
            return null;
        }
        TreeLinkNode cur = pNode;
        while(cur.next != null) {
            cur = cur.next;
        }
        inOrder(cur);
        for(int i = 0;i < list.size();i++) {
            if(list.get(i) == pNode && i+1 < list.size()) {
                return list.get(i+1);
            }
        }
        return null;
    }
    List<TreeLinkNode> list = new LinkedList<>();
    void inOrder(TreeLinkNode root) {
        if(root != null) {
            inOrder(root.left);
            list.add(root);
            inOrder(root.right);
        }
    }

    //JZ38 二叉树的深度
    public int TreeDepth(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return Math.max(TreeDepth(root.left),TreeDepth(root.right))+1;
    }

    //JZ62 二叉搜索树的第k个结点
    TreeNode KthNode(TreeNode pRoot, int k) {
        List<TreeNode> list = inOrder(pRoot);
        if(k <= 0 || k > list.size()) {
            return null;
        }
        return list.get(k-1);
    }
    List<TreeNode> list2 = new LinkedList<>();
    List inOrder(TreeNode root) {
        if(root == null) {
            return list;
        }
        inOrder(root.left);
        list2.add(root);
        inOrder(root.right);
        return list2;
    }
}
