package pe.gyarlequej.sesion7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {
        listDemo();
    }

    private static void listDemo() {
        List<String> frutas = new ArrayList<>();

        frutas.add("manzana");
        frutas.add("limon");
        frutas.add("platano");
        frutas.add("naranja");
        frutas.add("limon");
        frutas.add("pera");
        frutas.add("guayaba");
        frutas.add("guayaba");

        List<String> frutas2 = new ArrayList<>();
        frutas2.add("guaba");
        frutas2.add("uva");

        System.out.println(frutas.size());

        frutas.addAll(2, frutas2);

        frutas.remove("limon");

        System.out.println(frutas);

        System.out.println(frutas.get(0));

        System.out.println(frutas.indexOf("limon"));
        System.out.println(frutas.lastIndexOf("limon"));// 1 o 6

        System.out.println("***** Iterator ***** ");
        Iterator iterator = frutas.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("******** For Each *******");
        for(String fru : frutas) {
            System.out.println(fru);
        }

        System.out.println("******** For Each *******");
        for(String fru : frutas) {
            System.out.println(fru);
        }

        System.out.println("******** For Each Java8 *******");
        // frutas.forEach(fruta -> System.out.println(fruta));
        frutas.forEach(System.out::println);


        /*List<String> names = List.of("Giancarlo", "Elvis", "Yarleque", "Juarez");
        names.remove("Elvis");
        // names.add("Chayanne");*/



    }
}
