package pe.gyarlequej.sesion1;

import java.util.Scanner;

public class CalculaSalarioBruto {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Welcome to Java Course");
        // Este es un comentario
        // Este es otro comentario
        /*
        Este codigo sirve
        para calcular el salario bruto
        de un empleado
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese horas laboradas");
        int horas = scanner.nextInt();
        System.out.println("Ingrese el precio por hora");
        double precioPorHora = scanner.nextDouble();

        double salario = obtenerSalario(horas , precioPorHora);
        System.out.println("El salario es: " + salario);
    }

    public static double obtenerSalario(int horas, double precioPorHora) {
        return horas * precioPorHora;
    }

}
