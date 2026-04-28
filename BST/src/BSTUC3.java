public class BSTUC3 {
    public static void main(String[] args) {
        MyBinarySearchTree<Integer> bst = new MyBinarySearchTree<>();

        int[] values = {56, 30, 70, 22, 40, 60, 95, 11, 65, 3, 16, 63, 67};

        for (int value : values) {
            bst.add(value);
        }

        boolean result = bst.search(63);

        if (result) {
            System.out.println("63 found in Binary Search Tree");
        } else {
            System.out.println("63 not found in Binary Search Tree");
        }
    }
}