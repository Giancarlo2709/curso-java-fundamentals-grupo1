package pe.gyarlequej.sesion5;

import java.util.ArrayList;
import java.util.List;

public class WrapperClasses {

    public static void main(String[] args) {
        Integer num1 = 5;
        int num2 = 5;

        String num3 = "45";

        Integer num4 = Integer.parseInt(num3);

        System.out.println(num4);

        int num5 = num4.intValue();
        Integer num7 = null;

        Integer num8 = Integer.valueOf(45);

        List<Double> miLista = new ArrayList<>();
    }
}
