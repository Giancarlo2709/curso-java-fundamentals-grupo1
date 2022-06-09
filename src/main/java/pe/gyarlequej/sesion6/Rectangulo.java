package pe.gyarlequej.sesion6;

public class Rectangulo {

    protected double largo;
    protected double ancho;
    protected double lados = 4;

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double calcularPerimetro() {
        return 2 * (largo + ancho);
    }

    public void imprimir() {
        System.out.println("Soy un Rectangulo");
    }
}
