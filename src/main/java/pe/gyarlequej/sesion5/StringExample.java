package pe.gyarlequej.sesion5;

public class StringExample {

    public static void main(String[] args) {
        String nombre = new String("Giancarlo");
        String nombre2 = "GIANcarlo";

        System.out.println(nombre.equalsIgnoreCase(nombre2));

        System.out.println(nombre.toUpperCase()); // convierte a mayuscula
        System.out.println(nombre2.toLowerCase()); // convierte a minuscula



    }
}
