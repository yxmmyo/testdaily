package impl;

public class TreeNodeTestDemo {
    public static void main(String[] args) {
        TreeNode a = new TreeNode('A');
        TreeNode b = new TreeNode('B');
        TreeNode c = new TreeNode('C');
        TreeNode d = new TreeNode('D');
        TreeNode e = new TreeNode('E');
        TreeNode f = new TreeNode('F');
        TreeNode g = new TreeNode('G');
        TreeNode h = new TreeNode('H');
        TreeNode i = new TreeNode('I');
        TreeNode j = new TreeNode('J');

        a.left = b;
        a.right = c;

        b.left = d;
        b.right = null;

        c.left = e;
        c.right = f;

        d.left = g;
        d.right = null;

        e.left = null;
        e.right = null;

        f.left = h;
        f.right = i;

        g.left = null;
        g.right = j;

        h.left = null;
        h.right = null;

        i.left = null;
        i.right = null;

        j.left = null;
        j.right = null;

        int sum = leavesNode(a);
        System.out.println(sum);
        int n = TreeKleafNodeSize(a,5);
        System.out.println(n);
    }
    public static void preTraversal(TreeNode root) {
        if (root != null) {
            System.out.printf("%c",root.val);
            preTraversal(root.left);
            preTraversal(root.right);
        }
    }

    public static void inTraversal(TreeNode root) {
        if(root != null) {
            inTraversal(root.left);
            System.out.printf("%c",root.val);
            inTraversal(root.right);
        }
    }

    public static void postTraversal(TreeNode root) {
        if(root != null) {
            postTraversal(root.left);
            postTraversal(root.right);
            System.out.printf("%c",root.val);
        }
    }
    private static int count;
    public static int leavesNode(TreeNode root) {
        count = 0;
        pre(root);
        return count;
    }
    public static void pre(TreeNode root) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                count++;
            }
            pre(root.left);
            pre(root.right);
        }
    }
    public static int TreeKleafNodeSize(TreeNode root,int k) {
        if (root == null) {
            return 0;
        }else if (k == 1) {
            return 1;
        }else {
            int leftKleafNodeSize = TreeKleafNodeSize(root.left,k-1);
            int rightKlaeafNodeSize = TreeKleafNodeSize(root.right,k-1);
            return leftKleafNodeSize+rightKlaeafNodeSize;
        }

    }
}
