package pe.gyarlequej.sesion6.polimorfismo;

public class Animal {

    protected String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    protected void gemido() {
        System.out.println("Quiquiriqui");
    }
}
