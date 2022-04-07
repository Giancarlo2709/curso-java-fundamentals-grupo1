package pe.gyarlequej.sesion2;

public class OperadorLogico {

    public static void main(String[] args) {
        System.out.println("Resultado1: " + (2 > 3));
        System.out.println("Resultado2: " + (2 < 3));
        System.out.println("Resultado3: " + (4 >= 4));
        System.out.println("Resultado4: " + (4 <= 3));
        System.out.println("Resultado5: " + (3 == 2));
        System.out.println("Resultado6: " + (3 != 2));

        int miVariable = 5;

        boolean estaLocoElRobot = false;

        if (estaLocoElRobot == true) {
            System.out.println("Matar Humanos");
        } else {
            System.out.println("Ser buenos con los humanos");
        }

        System.out.println("Resultado 7: " + (1 <= 2  && 4 != 5));
        System.out.println("Resultado 8: " + (3 == 4 || "Yisus".equals("Yisus")));
        System.out.println("Resultado 9: " + (!(2 == 3)));


    }
}
