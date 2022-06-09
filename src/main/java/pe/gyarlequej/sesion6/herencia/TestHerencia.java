package pe.gyarlequej.sesion6.herencia;

public class TestHerencia {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Giancarlo", 29,"123", "Programador");

        System.out.println(empleado.getNombre());
        System.out.println(empleado.getGenero());
        System.out.println(empleado.getEdad());

        System.out.println(empleado.calcularPeso());
        empleado.methodPrivate();
        System.out.println(empleado.privateAttribute);

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setAncho(4);
        rectangulo.setLargo(3);

        System.out.println("***** RECTANGLE *****");
        System.out.println(rectangulo.calcularPerimetro());

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setLargo(4);
        // cuadrado.setAncho(4);

        System.out.println("***** SQUARE *****");
        System.out.println(cuadrado.calcularPerimetro());

        cuadrado.imprimir(cuadrado.getClass().getSimpleName());

        Mujer mujer = new Mujer("Lisbeidy");
        System.out.println(mujer);

        Madre madre = new Madre("Lis");
        System.out.println(madre);

    }
}
