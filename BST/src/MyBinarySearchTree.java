public class MyBinarySearchTree<K extends Comparable<K>> {
    private MyBinaryNode<K> root;

    public void add(K key) {
        root = addRecursively(root, key);
    }

    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
        if (current == null) {
            return new MyBinaryNode<>(key);
        }

        if (key.compareTo(current.key) < 0) {
            current.left = addRecursively(current.left, key);
        } else if (key.compareTo(current.key) > 0) {
            current.right = addRecursively(current.right, key);
        }

        return current;
    }

    public int size() {
        return getSize(root);
    }

    private int getSize(MyBinaryNode<K> current) {
        if (current == null) {
            return 0;
        }

        return 1 + getSize(current.left) + getSize(current.right);
    }

    public boolean search(K key) {
        return searchRecursively(root, key);
    }

    private boolean searchRecursively(MyBinaryNode<K> current, K key) {
        if (current == null) {
            return false;
        }

        if (current.key.equals(key)) {
            return true;
        }

        if (key.compareTo(current.key) < 0) {
            return searchRecursively(current.left, key);
        } else {
            return searchRecursively(current.right, key);
        }
    }

    public void inorder() {
        inorderRecursively(root);
        System.out.println();
    }

    private void inorderRecursively(MyBinaryNode<K> current) {
        if (current != null) {
            inorderRecursively(current.left);
            System.out.print(current.key + " ");
            inorderRecursively(current.right);
        }
    }
}