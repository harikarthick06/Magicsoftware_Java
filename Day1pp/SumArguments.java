package Day1pp;

class SumArguments {
    public static void main(String[] args) {
        int sum = 0;
        int invalidCount = 0;

        for (String arg : args) {
            try {
                sum += Integer.parseInt(arg);
            } catch (NumberFormatException e) {
                invalidCount++;
            }
        }

        System.out.println("Sum = " + sum);
        System.out.println("Invalid integers = " + invalidCount);
    }
}