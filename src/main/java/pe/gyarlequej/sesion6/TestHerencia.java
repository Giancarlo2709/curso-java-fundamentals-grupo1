package pe.gyarlequej.sesion6;

public class TestHerencia {

    public static void main(String[] args) {
        Empleado empleado = new Empleado("Giancarlo", 29,"123", "Programador");

        System.out.println(empleado.getNombre());
        System.out.println(empleado.getGenero());
        System.out.println(empleado.getEdad());

        System.out.println(empleado.calcularPeso());

    }
}
