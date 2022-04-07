package pe.gyarlequej.sesion2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalificadorPrestamoTest {

    @Test
    @DisplayName("Test cuando el trabajador califica a un prestamo")
    void testCuandoCalificaAlPrestamo() {
        boolean resultadoActual = CalificadorPrestamo.estaCalificadoAlPrestamo(3000, 2);
        assertTrue(resultadoActual, "Debería estar calificado al prestamo");
    }

    @Test
    @DisplayName("Test cuando el trabajador no califica a un prestamo")
    void testCuandoNoCalificaAlPrestamo() {
        boolean resultadoActual = CalificadorPrestamo.estaCalificadoAlPrestamo(1500, 2);
        assertFalse(resultadoActual);
    }

}