package pe.gyarlequej.sesion3;

public class EstructurasRepetitivas {

    public static void main(String[] args) {
        /*
        Inicialización
        Condición
        Bloque de sentencias
        Actualización
         */


        int numeros = 10;

        System.out.println("**************** WHILE ****************");
        int i = 11;
        while (i <= numeros) {
            System.out.println(i);
            i = i + 1;
        }

        System.out.println("**************** DO WHILE ****************");

        int a = 11;
        do {
            System.out.println(a);
            a = a + 1;
        } while (a <= numeros);

        System.out.println("**************** For ****************");

        /*
        for(inicializacion; condicion; actualizacion) {

            bloque de sentencias
        } */

        for(int b = 1; b <= numeros ; b++) {
            System.out.println(b);
        }

        System.out.println("**************** For EACH****************");

        /* for(TipoDato nombreVariable : collecion) {
            bloque de sentencias
        } */

        String[] names = new String[3];
        names[0] = "Giancarlo";
        names[1] = "Elvis";
        names[2] = "Yarlequé";

        for(String name : names) {
            System.out.println(name);
        }

        System.out.println(" ********* Break con for *********");
        for (int y = 1; y <= 5; y++) {
            System.out.println("Iterator: " + y);
            if (y == 3) {
                break;
            }
        }

        System.out.println(" ********* Break con while *********");
        int e = 1;
        while (e < 6) {
            System.out.println("Iterator: " + e);
            if (e == 4) {
                break;
            }
            e++;
        }

        System.out.println(" ********* Break Characters *********");

        String words = "Its &a #word";
        char[] characters = words.toCharArray();
        for(int z = 0; z < characters.length; z++) {
            System.out.println(characters[z]);
            int ascii = characters[z];
            // System.out.println(ascii);
            if (ascii >= 33 && ascii <= 47) {
                break;
            }
        }


    }

}
