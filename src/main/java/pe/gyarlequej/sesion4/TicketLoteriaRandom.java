package pe.gyarlequej.sesion4;

import java.util.Arrays;
import java.util.Random;

/*
Crear una aplicación que genere un ticket de lotería  con 6 números aleatorios entre 1 – 69.
1 | 2 | 56 | 5 | 23 | 12 |

 */
public class TicketLoteriaRandom {

    private static int numeroDeElementos = 6;
    public static int max = 69;

    public static void main(String[] args) {
        int[] tickets = generarNumeros();
        imprimirTickets(tickets);
    }

    public static int[] generarNumeros() {
        int[] tickets = new int[numeroDeElementos];

        Random random = new Random();

        for (int i= 0; i < tickets.length; i++) {
            tickets[i] = random.nextInt(max) + 1;
        }

        return tickets;
    }

    public static void imprimirTickets(int[] tickets) {
        for (int j = 0; j < tickets.length; j++) {
            System.out.println("Elemento de la posicion " + j +" : " + tickets[j]);
        }
    }
}
