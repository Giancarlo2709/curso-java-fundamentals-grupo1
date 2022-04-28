package pe.gyarlequej.sesion3;

import java.util.Scanner;

public class Factorial {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // 5! = 5 x 4 x 3 x 2 x 1
        // 6! = 6 x 5 x 4 x 3 x 2 x 1

        System.out.println("Ingrese el numero: ");
        int number = scanner.nextInt();

        long factorial = 1;
        int init = 2;
        while (init <= number) {
            factorial = factorial * init;
            init++; // -> init = init + 1
        }

        System.out.println("El factorial de: " + number + " es: " + factorial);

        /*  init            factorial
            1                1 * 1 = 1
            2                1 * 2 = 2
            3                2 * 3 = 6
            4                6 * 4 = 24
         */

        int iFactorial = 1;
        for (int x = 2; x <= number; x++) {
            iFactorial = iFactorial * x;
        }

        System.out.println("El factorial de: " + number + " es: " + iFactorial);




    }
}
