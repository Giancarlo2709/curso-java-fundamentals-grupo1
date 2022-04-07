package pe.gyarlequej.sesion1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculaSalarioBrutoTest {

    @Test
    @DisplayName("El salario bruto de un empleado")
    void obtenerSalario() {
        double salarioActual = CalculaSalarioBruto.obtenerSalario(8,20);
        double salarioEsperado = 160;

        assertEquals(salarioEsperado, salarioActual, "El salario no es el esperado");
    }
}