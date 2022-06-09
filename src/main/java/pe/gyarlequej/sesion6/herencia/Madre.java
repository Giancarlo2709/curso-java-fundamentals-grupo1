package pe.gyarlequej.sesion6.herencia;

public class Madre extends Mujer {

    public Madre(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return super.getNombre();
    }
}
