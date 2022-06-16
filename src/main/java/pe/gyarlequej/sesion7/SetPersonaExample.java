package pe.gyarlequej.sesion7;

import java.util.HashSet;
import java.util.Set;

public class SetPersonaExample {

    public static void main(String[] args) {
        Set<Persona> personas = new HashSet<>();
        personas.add(new Persona("Giancarlo Elvis", "Yarleque Juarez", "44332211", 25));
        personas.add(new Persona("Elvis", "Yarleque", "44332211", 23));
        personas.add(new Persona("Sarah", "Pacheco", "12345678", 25));
        personas.add(new Persona("Eduardo Oscar", "Gomez Victorio", "43424341", 29));

        System.out.println(personas.size());

        System.out.println("********* JAVA 7 **********");
        personas.forEach(persona -> {
            if (persona.getEdad() > 23) {
                System.out.println(persona);
            }
        });

        System.out.println("********* JAVA 8 **********");
        personas.stream().filter(persona -> persona.getEdad() > 23).forEach(System.out::println);

    }
}
