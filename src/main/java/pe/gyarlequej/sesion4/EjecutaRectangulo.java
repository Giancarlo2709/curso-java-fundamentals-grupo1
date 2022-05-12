package pe.gyarlequej.sesion4;

public class EjecutaRectangulo {

    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(18, 15);

        System.out.println(rectangulo1.calcularArea());
        System.out.println(rectangulo1.calcularPerimetro());

        Rectangulo rectangulo2 = new Rectangulo();
        rectangulo2.setAncho(15);
        rectangulo2.setLargo(10);

        System.out.println(rectangulo2.calcularArea());
        System.out.println(rectangulo2.calcularPerimetro());
    }
}
