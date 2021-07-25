package binary_search_tree;

public class Main2_0725 {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.inSert(5);
        tree.inSert(3);
        tree.inSert(7);
        tree.inSert(9);
        tree.inSert(10);
        tree.inSert(2);
        tree.inSert(0);
        tree.inSert(8);
        tree.inSert(4);
        tree.inSert(1);
        tree.inSert(6);
        System.out.println("Hello");
        for (int i = -1; i < 12; i++) {
            System.out.println(i+":"+tree.search(i));
        }
    }
}
