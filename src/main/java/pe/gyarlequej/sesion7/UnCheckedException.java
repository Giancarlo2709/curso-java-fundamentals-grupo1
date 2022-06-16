package pe.gyarlequej.sesion7;

public class UnCheckedException {

    public static void main(String[] args) {
        Matematicas matematicas = new Matematicas();
        double resultado = matematicas.dividirUnChecked(5, 0);

        System.out.println("El resultado es: " + resultado);
    }
}
