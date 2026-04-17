public class DefaultValue {
    int a;
    float b;
    double c;
    char d;
    boolean e;
    byte f;
    short g;
    long h;
    //1.2 Write a Java program to display the default value of all primitive data types of Java
    public static void main(String[] args) {
        DefaultValue dv = new DefaultValue();
        System.out.println(dv.a + " int");
        System.out.println(dv.b + " float");
        System.out.println(dv.c + " double");
        System.out.println(dv.d + " char");
        System.out.println(dv.e + " boolean");
        System.out.println(dv.f + " byte");
        System.out.println(dv.g + " short");
        System.out.println(dv.h + " long");




    }
}
