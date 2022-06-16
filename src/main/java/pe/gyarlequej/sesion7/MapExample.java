package pe.gyarlequej.sesion7;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {
        mapDemo();
    }

    private static void mapDemo() {

        Map<String, Integer> frutaCalorias = new HashMap<>();

        Map<String, Integer> frutasCalorias2 = new HashMap<>();
        frutasCalorias2.put("uva", 150);
        frutasCalorias2.put("pera", 80);

        frutaCalorias.put("manzana", 95);
        frutaCalorias.put("limon", 20);
        frutaCalorias.put("platano", 105);
        frutaCalorias.put("naranja", 45);
        frutaCalorias.put("limon", 17);

        frutaCalorias.putAll(frutasCalorias2);

        System.out.println(frutaCalorias.size());
        System.out.println(frutaCalorias);

        System.out.println(frutaCalorias.get("limon"));
        System.out.println(frutaCalorias.entrySet());

        System.out.println(frutasCalorias2.containsKey("uva"));
        System.out.println(frutasCalorias2.containsValue(155));


        System.out.println("**** Recorriendo con Java Version Menor a 8 **************** ");
        for(Map.Entry<String, Integer> element : frutaCalorias.entrySet()) {
            System.out.println("Key: " + element.getKey() + " Value: " + element.getValue());
        }

        System.out.println("**** Recorriendo con Java a 8 **************** ");

        frutaCalorias.forEach((key, value) -> System.out.println("Key: " + key + " Value: " + value));
    }
}
