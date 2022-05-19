package pe.gyarlequej.sesion4;

import java.util.Arrays;
import java.util.Scanner;

/*
Crear un programa que permita al usuario ingresar cualquier número de calificaciones y les proporciona su puntaje promedio,
así como los puntajes más altos y más bajos.
 */
public class Calificaciones {

    private static int calificaciones[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("¿Cuantas calificaciones usted desearía ingresar?");
        calificaciones = new int[scanner.nextInt()];

        obtenerCalificaciones();

        //Arrays.stream(calificaciones).forEach(System.out::println);

        System.out.println("El promedio es: " + calcularPromedio());
        System.out.println("Mayor Calificacion: " + getMayorCalificacion());
        System.out.println("Menor Calificacion: " + getMenorCalificacion());

    }

    private static void obtenerCalificaciones() {
        // inicializacion, condicion, incremento o actualizacion
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Ingresar calificacion # " + (i + 1));
            calificaciones[i] = scanner.nextInt();
        }
    }

    public static int sumaCalificaciones() {
        int suma = 0;

        for (int nota : calificaciones) {
            suma = suma + nota;
        }

        return suma;
    }

    public static double calcularPromedio() {
        return sumaCalificaciones() / calificaciones.length;
    }

    public static int getMayorCalificacion() {
        int mayorCalificacion = calificaciones[0];//12, 11, 10

        for (int nota : calificaciones) {
            if (nota > mayorCalificacion) {
                mayorCalificacion = nota;
            }
        }
        return mayorCalificacion;
    }

    public static int getMenorCalificacion() {
        int menorCalificacion = calificaciones[0];

        for (int nota : calificaciones) {
            if (nota < menorCalificacion) {
                menorCalificacion = nota;
            }
        }
        return menorCalificacion;
    }

}
