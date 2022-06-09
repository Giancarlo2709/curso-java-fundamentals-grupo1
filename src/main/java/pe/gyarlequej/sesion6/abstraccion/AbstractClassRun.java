package pe.gyarlequej.sesion6.abstraccion;

public class AbstractClassRun {

    public static void main(String[] args) {
        FiguraGeometrica figura = new Rectangulo("Rectangulo", 4, 3);
        figura.dibujar();
        figura.calcularArea();

        figura = new Triangulo("Triangulo", 4, 3);
        figura.dibujar();
        figura.calcularArea();
    }
}
