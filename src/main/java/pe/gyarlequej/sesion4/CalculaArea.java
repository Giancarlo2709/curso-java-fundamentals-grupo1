package pe.gyarlequej.sesion4;

import java.util.Scanner;

public class CalculaArea {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CalculaArea calculaArea = new CalculaArea();

        Rectangulo cocina = calculaArea.getRectangulo("cocina");
        Rectangulo banio = calculaArea.getRectangulo("banio");

        System.out.println("El area total es: " + calculaArea.calcularAreaTotal(cocina, banio));
        System.out.println("El perimetro total es: " + calculaArea.calcularPerimetroTotal(cocina, banio));

    }

    public Rectangulo getRectangulo(String descripcion) {
        System.out.println("Ingrese el largo de " + descripcion);
        double largo = scanner.nextDouble();

        System.out.println("Ingrese el ancho de " + descripcion);
        double ancho = scanner.nextDouble();

        return new Rectangulo(largo, ancho);
    }

    public double calcularAreaTotal(Rectangulo cocina, Rectangulo banio) {
        return cocina.calcularArea() + banio.calcularArea();
    }

    public double calcularPerimetroTotal(Rectangulo cocina, Rectangulo banio) {
        return cocina.calcularPerimetro() + banio.calcularPerimetro();
    }
}
