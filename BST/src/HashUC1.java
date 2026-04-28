public class HashUC1 {
    public static void main(String[] args) {
        String sentence = "To be or not to be";

        MyHashMap<String, Integer> map = new MyHashMap<>();

        String[] words = sentence.toLowerCase().split(" ");

        for (String word : words) {
            Integer frequency = map.get(word);

            if (frequency == null) {
                map.add(word, 1);
            } else {
                map.add(word, frequency + 1);
            }
        }

        map.printMap();
    }
}