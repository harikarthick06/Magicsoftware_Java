public class HashUC2 {
    public static void main(String[] args) {
        String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

        MyHashMap<String, Integer> map = new MyHashMap<>();

        String[] words = paragraph.toLowerCase().split(" ");

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