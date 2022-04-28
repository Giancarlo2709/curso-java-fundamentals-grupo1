package pe.gyarlequej.sesion3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerificationCreditTest {

    @Test
    void isAQualifiedUser() {
        boolean isQualified = VerificationCredit.isAQualifiedUser(25000,800);
        assertTrue(isQualified);
    }

    @Test
    public void userQualifiedForCredit() {
        boolean isQualified = VerificationCredit.isAQualifiedUser(25000,800);
        assertTrue(isQualified);
        Double salaryRequired = VerificationCredit.salaryRequired;
        Double salaryExpected = 25000.0;
        assertEquals(salaryExpected, salaryRequired);
        assertEquals(700,VerificationCredit.scoreCreditRequired);
    }
}