package pe.gyarlequej.sesion3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleMethodTest {

    @Test
    void getName() {
        String nameActual = ExampleMethod.getName("Giancarlo");
        String nameExpected = "Giancarlo";

        assertEquals(nameExpected, nameActual," The names are not equals");
    }
}