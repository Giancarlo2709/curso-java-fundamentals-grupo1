package pe.gyarlequej.sesion6.abstraccion;

public class AnimalRun {

    public static void main(String[] args) {
        Animal animal = new Pato();
        animal.hacerSonido();
        animal.comer();

        animal = new Cerdo();
        animal.hacerSonido();
        animal.comer();

    }
}
