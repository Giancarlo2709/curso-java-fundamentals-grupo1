package pe.gyarlequej.sesion7;

public class HorasPermitidas {

    static int horas = 50;

    public static void main(String[] args) {
        if (horas > 48) {
            throw new NoOvertimeAllowedException("Horas extras no estan permitidas");
        }
    }
}
