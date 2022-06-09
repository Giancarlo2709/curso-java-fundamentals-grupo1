package pe.gyarlequej.sesion6.polimorfismo;

public class Zoologico {

    public static void main(String[] args) {
        Animal animal = new Gato("Michifu");

        gemir(animal);

        Animal animal2 = new Perro("Firulais");
        gemir(animal2);

        Perro perro = new Perro("Rocky");

        perro.gemido();
        perro.buscar();

        Animal rocky = new Perro("Rocky Balboa");
        rocky.gemido();
        ((Perro) rocky).buscar();

        rocky = new Gato("Michifu");
        ((Gato) rocky).rasguniar();
    }

    private static void gemir(Animal animal) {
        animal.gemido();
    }
}
