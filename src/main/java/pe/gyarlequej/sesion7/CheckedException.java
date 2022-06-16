package pe.gyarlequej.sesion7;

public class CheckedException {

    public static void main(String[] args) throws Exception {
        Matematicas matematicas = new Matematicas();
        // primeraForma(matematicas);
        segundaForma(matematicas);
    }

    private static void segundaForma(Matematicas matematicas) throws Exception {
        double resultado = matematicas.dividir(5,0);
        System.out.println("El resultado es: " + resultado);
    }


    private static void primeraForma(Matematicas matematicas) {
        try {
            double resultado = matematicas.dividir(5, 0);
            System.out.println("El resultado es: " + resultado);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
