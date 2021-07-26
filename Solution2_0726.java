package Tree_0726;

import java.util.ArrayList;
import java.util.List;

public class Solution2_0726 {
    //给定某二叉树的前序遍历和中序遍历，请重建出该二叉树并返回它的头结点。
    public List<Integer> arrayToList(int[] ary) {
        List<Integer> list = new ArrayList<>();
        for(int i : ary) {
            list.add(i);
        }
        return list;
    }
    public TreeNode buildNewTree(List<Integer> pre,List<Integer> in) {
        if(pre.isEmpty()) {
            return null;
        }
        int rootVal = pre.get(0);
        TreeNode node = new TreeNode(rootVal);
        if(pre.size() == 1) {
            return node;
        }
        int leftSize = in.indexOf(rootVal);
        List<Integer> leftPre = pre.subList(1,leftSize+1);
        List<Integer> rightPre = pre.subList(leftSize+1,pre.size());
        List<Integer> leftIn = in.subList(0,leftSize);
        List<Integer> rightIn = in.subList(leftSize+1,in.size());
        node.left =  buildNewTree(leftPre,leftIn);
        node.right =  buildNewTree(rightPre,rightIn);
        return node;
    }
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        List<Integer> preOrder = arrayToList(pre);
        List<Integer> inOrder = arrayToList(in);
        return buildNewTree(preOrder,inOrder);
    }
}
