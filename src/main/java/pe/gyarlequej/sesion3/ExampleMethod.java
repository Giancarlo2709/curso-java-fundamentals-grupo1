package pe.gyarlequej.sesion3;

import java.util.Scanner;

/*
Escriba un método que le pregunte a un usuario su nombre, luego lo saluda por su nombre.
 */
public class ExampleMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");

        String name = scanner.nextLine();
        System.out.println("Hello, " + getName(name));

        System.out.println("Insert number 1");
        int number1 = scanner.nextInt();

        System.out.println("Insert number 2");
        int number2 = scanner.nextInt();

        System.out.println("The addition is : " + add(number1, number2));
        System.out.println("The multiply is : " + multiply(number1, number2));

    }

    public static String getName(String name) {
        return name;
    }

    public static int add (int number1, int number2) {
        return number1 + number2;
    }

    public static int multiply (int number1, int number2) {
        return number1 * number2;
    }


}
