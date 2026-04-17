package Day1pp;

class StaticDemo {
    static int number;   // static variable

    static {
        number = 100;
        System.out.println("Static block executed.");
    }

    static void display() {
        System.out.println("Static method called.");
        System.out.println("Value of number = " + number);
    }

    public static void main(String[] args) {
        display();
    }
}