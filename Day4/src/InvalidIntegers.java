public class InvalidIntegers {
    //1.4 To find the sum of command-line arguments and count the invalid integers entered.
    public static void main(String[] args) {
        int sum = 0;
        int invalid = 0;
        for (String arg : args) {
            if (arg.matches("\\d+")) {
                sum += Integer.parseInt(arg);
            } else {
                invalid++;
            }
        }
        System.out.println("Sum: " + sum);
        System.out.println("Invalid: " + invalid);

    }
}
