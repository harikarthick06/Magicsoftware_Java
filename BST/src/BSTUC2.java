public class BSTUC2 {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();

        int[] values = {56, 30, 70, 22, 40, 60, 95, 11, 65, 3, 16, 63, 67};

        for (int value : values) {
            bst.add(value);
        }

        bst.inorder();
        System.out.println("Size: " + bst.size());
    }
}