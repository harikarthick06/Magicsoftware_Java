package Arrays;

public class secondMin {
    public static void main(String[] args) {

        int[] arr = {10, 20, 5, 8, 15};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > largest) {
                secondLargest = largest;
                largest = num;

            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Largest Number: " + largest);
        System.out.println("2nd Largest Number: " + secondLargest);
    }
}