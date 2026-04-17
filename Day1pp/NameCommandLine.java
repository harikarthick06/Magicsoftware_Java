package Day1pp;

class NameCommandLine {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Your name is: " + args[0]);
        } else {
            System.out.println("No name entered in command line.");
        }
    }
}