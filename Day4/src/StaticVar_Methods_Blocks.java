public class StaticVar_Methods_Blocks {
    static int var = 0;

    static void method() {
        var++;
        System.out.println(var);
    }
    static {
        var++;
    }
    //1.6 Write a program to demonstrate static variables, methods, and blocks.
    public static void main(String[] args) {
        System.out.println(var);
        var = 10;
        System.out.println(var);
        method();
    }
}
