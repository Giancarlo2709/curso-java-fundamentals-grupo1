package pe.gyarlequej.sesion5;

import java.util.Arrays;

public class ProcesadorTexto {

    public static void main(String[] args) {
        contarPalabras("Hola Bienvenidos a mi curso de java basico");
        revertirCadena("quiero una manzana");
        agregarEspacios("Hola!EstamosAutomatizandoElMundo");
    }

    /*
    Escriba un método que cuente el número de palabras en una cadena y las imprima
    individualmente en una nueva línea.
     */
    public static void contarPalabras(String texto) {
        String textoSplit = "hola,mundo,que,tal";

        for(String split : textoSplit.split(",")) {
            System.out.println("split: " + split);
        }

        String[] palabras = texto.split(" ");

        int numeroDePalabras = palabras.length;

        System.out.println("Numero de palabras: " + numeroDePalabras);

        // Arrays.stream(palabras).forEach(System.out::println); // Java 8+

        for (String pal : palabras) {
            System.out.println(pal);
        }
    }

    /*
    Escriba un método que imprima un String al revés. Por ejemplo, si se da ”quiero una manzana",
    imprime "anaznam anu oreiuq".
     */
    public static void revertirCadena(String texto) {
        // quiero una manzana
        for (int i = texto.length() - 1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }
        System.out.println();
    }

    /*
    Escriba un método que agregue espacios a Strings mezclados donde todas las palabras se escriben juntas
    sin espacios. Cada nueva palabra comienza con una letra mayúscula,
     */
    public static void agregarEspacios(String texto) {
        StringBuilder stringBuilder = new StringBuilder(texto);

        //Hola!EstamosAutomatizandoElMundo
        //Hola! Estamos Automatizando El Mundo

        for(int i = 0; i < stringBuilder.length(); i++) {
            if (i != 0 && Character.isUpperCase(stringBuilder.charAt(i))) {
                stringBuilder.insert(i, " ");
                i++;
            }
        }

        System.out.println(stringBuilder);

        String nombres3 = new String("Lisbeidy");

        nombres3 = nombres3 + "Pintado" + "Alberca" + "De Melendez";

        StringBuilder nombres = new StringBuilder();
        nombres.append("Giancarlo").append("Elvis").append("Yarleque").append("Juarez");

        System.out.println(nombres);
        System.out.println(nombres.replace(9,14, "Gianmarco"));
        System.out.println(nombres.deleteCharAt(2));
        //System.out.println(nombres.delete(2,3));

        System.out.println(nombres.reverse());


    }
}
