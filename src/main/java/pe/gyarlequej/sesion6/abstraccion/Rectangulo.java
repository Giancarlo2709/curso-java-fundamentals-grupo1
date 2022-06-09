package pe.gyarlequej.sesion6.abstraccion;

public class Rectangulo extends FiguraGeometrica {

    private double largo;
    private double ancho;

    public Rectangulo(String tipoFigura, double largo, double ancho) {
        super(tipoFigura);
        this.largo = largo;
        this.ancho = ancho;
    }

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

    @Override
    public void dibujar() {
        System.out.println("Se imprime un: " + this.getClass().getSimpleName());
    }

    @Override
    public void calcularArea() {
        System.out.println("El area del " + this.getClass().getSimpleName() + " es: " + (ancho * largo));
    }
}
