package pe.gyarlequej.sesion7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {
        setDemo();
    }

    public static void setDemo() {
        Set<String> frutas = new HashSet<>(5);

        frutas.add("manzana");
        frutas.add("limon");
        frutas.add("platano");
        frutas.add("naranja");
        frutas.add("limon");
        frutas.add("pera");
        frutas.add("guayaba");
        frutas.add("guayaba");

        System.out.println("******************* Begin SET *******************");

        System.out.println(frutas.size());
        System.out.println(frutas);

        System.out.println("******** Iterator *******");
        Iterator<String> iterator = frutas.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
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
