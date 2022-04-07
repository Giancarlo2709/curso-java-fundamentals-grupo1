package pe.gyarlequej.sesion2;

public class EjemploString {

    public static void main(String[] args) {
        String name = "Giancarlo";
        String name2 = new String("GianCarlo");

        if (name == name2) {
            System.out.println("Son Iguales");
        } else {
            System.out.println("No son iguales");
        }

        if (name.equals(name2)) {
            System.out.println("Son Iguales");
        } else {
            System.out.println("No son iguales");
        }

        if (name.equalsIgnoreCase(name2)) {
            System.out.println("Son Tocayos");
        } else {
            System.out.println("No Son Tocayos");
        }


    }
}
