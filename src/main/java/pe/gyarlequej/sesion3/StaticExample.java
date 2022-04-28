package pe.gyarlequej.sesion3;

public class StaticExample {

    static int miVariable = 5;

    public static void main(String[] args) {
        /*StaticExample staticExample = new StaticExample();
        staticExample.method();*/
        StaticExample.method();
        System.out.println(StaticExample.miVariable);
        System.out.println(greeting2("Giancarlo", "Hello"));
    }

    private static void method() {
        System.out.println("Hello World");
    }

    private static String greeting() {
        return "Hello";
    }

    private static String greeting2(String name, String greeting) {
        System.out.println("Result : " + (4+5));
        System.out.println("Result 2: " + (4*5));
        return greeting + " " + name;
    }
}
