package pe.gyarlequej.sesion4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/*
Crear una aplicación que genere un ticket de lotería  con 6 números aleatorios entre 1 – 69.
1 | 2 | 56 | 5 | 23 | 12 |

 */
public class TicketLoteriaRandomBusqueda {

    private static int numeroDeElementos = 6;
    public static int max = 69;

    public static void main(String[] args) {
        Integer[] tickets = generarNumeros();

         //boolean encontrado = busquedaSecuencial(tickets, 5);
        boolean encontrado = busquedaBinaria(tickets, 5);

        Arrays.sort(tickets, Collections.reverseOrder());

        System.out.println(encontrado);
        imprimirTickets(tickets);
    }

    public static Integer[] generarNumeros() {
        Integer[] tickets = new Integer[numeroDeElementos];

        Random random = new Random();

        for (int i= 0; i < tickets.length; i++) {
            tickets[i] = random.nextInt(max) + 1;
        }

        return tickets;
    }

    public static boolean busquedaSecuencial(Integer[] array, int datoABuscar) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == datoABuscar) {
                return true;
            }
        }
        return false;
    }

    public static boolean busquedaBinaria(Integer[] array, int datoABuscar) {
        Arrays.sort(array);

        int index = Arrays.binarySearch(array, datoABuscar);

        if (index >= 0) {
            return true;
        }

        return false;
    }

    public static void imprimirTickets(Integer[] tickets) {
        for (int j = 0; j < tickets.length; j++) {
            System.out.println("Elemento de la posicion " + j +" : " + tickets[j]);
        }
    }
}
