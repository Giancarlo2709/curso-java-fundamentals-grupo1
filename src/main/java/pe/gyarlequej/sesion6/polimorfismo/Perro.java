package pe.gyarlequej.sesion6.polimorfismo;

public class Perro extends Animal {

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    protected void gemido() {
        System.out.println("Hola me llamo " + nombre + " y hago guau!");
    }

    public void buscar() {
        System.out.println("Buscar es divertido!");
    }
}
