package pe.gyarlequej.sesion7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        queueDemo();
    }

    private static void queueDemo() {

        Queue<String> frutas = new LinkedList<>();
        frutas.add("manzana");
        frutas.add("limon");
        frutas.add("platano");
        frutas.add("naranja");
        frutas.add("limon");

        System.out.println(frutas.size());
        System.out.println(frutas);

        System.out.println("remove: " + frutas.remove());

        System.out.println(frutas);

        System.out.println("remove: " + frutas.remove());
        System.out.println("poll: " + frutas.poll());

        System.out.println("***** Iterator ***** ");

        Iterator<String> iterator = frutas.iterator();
        while (iterator.hasNext()) {
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

    }
}
