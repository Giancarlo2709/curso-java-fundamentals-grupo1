package pe.gyarlequej.sesion6;

public class Cuadrado extends Rectangulo {

    @Override
    public double calcularPerimetro() {
        return 4 * largo;
    }

    public void imprimir(String nombreClase) {
        System.out.println("Soy un " + nombreClase);
    }
}
