package comeTrueTreeMap;

public class MyTreeMap {
    private TreeNode root;
    public Integer put(String key,Integer value) {
        if (root == null) {
            root = new TreeNode(key,value);
            return null;
        }
        TreeNode parent = null;
        TreeNode cur = root;
        while (cur != null) {
            int cmp = key.compareTo(cur.key);
            if (cmp == 0) {
                Integer oldValue = cur.value;
                cur.value = value;
                return oldValue;
            } else if (cmp < 0) {
                parent = cur;
                cur = cur.left;
            } else {
                parent = cur;
                cur = cur.right;
            }
        }
        int cmp = key.compareTo(parent.key);
        if (cmp < 0) {
            parent.left = new TreeNode(key, value);
        } else {
            parent.right = new TreeNode(key, value);
        }
        return null;
    }
    public Integer get(String key) {
        TreeNode cur = root;
        while (cur != null) {
            int cmp = key.compareTo(cur.key);
            if (cmp == 0) {
                return cur.value;
            } else if (cmp < 0) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return null;
    }
    public Integer getOrDefault(String key,Integer defaultValue) {
        TreeNode cur = root;
        while (cur != null) {
            int cmp = key.compareTo(cur.key);
            if (cmp == 0) {
                return cur.value;
            } else if (cmp < 0) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return defaultValue;
    }
}
