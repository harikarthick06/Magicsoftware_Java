public class MyHashMap<K, V> {
    private final int size;
    private MyMapNode<K, V>[] bucketArray;

    public MyHashMap() {
        this.size = 10;
        this.bucketArray = new MyMapNode[size];
    }

    private int getBucketIndex(K key) {
        int hashCode = Math.abs(key.hashCode());
        return hashCode % size;
    }

    public V get(K key) {
        int index = getBucketIndex(key);
        MyMapNode<K, V> temp = bucketArray[index];

        while (temp != null) {
            if (temp.key.equals(key)) {
                return temp.value;
            }
            temp = temp.next;
        }

        return null;
    }

    public void add(K key, V value) {
        int index = getBucketIndex(key);
        MyMapNode<K, V> temp = bucketArray[index];

        while (temp != null) {
            if (temp.key.equals(key)) {
                temp.value = value;
                return;
            }
            temp = temp.next;
        }

        MyMapNode<K, V> newNode = new MyMapNode<>(key, value);
        newNode.next = bucketArray[index];
        bucketArray[index] = newNode;
    }

    public void remove(K key) {
        int index = getBucketIndex(key);
        MyMapNode<K, V> temp = bucketArray[index];
        MyMapNode<K, V> previous = null;

        while (temp != null) {
            if (temp.key.equals(key)) {
                if (previous == null) {
                    bucketArray[index] = temp.next;
                } else {
                    previous.next = temp.next;
                }
                return;
            }

            previous = temp;
            temp = temp.next;
        }
    }

    public void printMap() {
        for (int i = 0; i < size; i++) {
            MyMapNode<K, V> temp = bucketArray[i];

            while (temp != null) {
                System.out.println(temp.key + " : " + temp.value);
                temp = temp.next;
            }
        }
    }
}