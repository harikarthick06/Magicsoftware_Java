package Arrays;
class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 2, 3, 8, 8, 3};
        int[] visited = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (visited[i] == 1)
                continue;

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = 1;
                }
            }

            System.out.println(arr[i] + " occurs " + count + " times");
        }
    }
}