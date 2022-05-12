package pe.gyarlequej.sesion4;

import java.util.Arrays;

public class TicketLoteria {

    public static void main(String[] args) {
        int[] numeros = new int[5];
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;
        numeros[5] = 60;

        for(int i = 0; i < numeros.length ; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("********* FOREACH ********");

        for (int num : numeros) {
            System.out.println(num);
        }

        System.out.println("********* JAVA 8 ********");

        Arrays.stream(numeros)
                .forEach(System.out::println);
    }
}
