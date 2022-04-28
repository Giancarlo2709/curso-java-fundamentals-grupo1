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


    }

}
