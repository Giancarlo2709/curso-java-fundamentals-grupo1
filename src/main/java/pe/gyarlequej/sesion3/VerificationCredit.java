package pe.gyarlequej.sesion3;

import java.util.Scanner;

/*
Escriba un programa de "verificación de crédito instantánea" que apruebe cualquier
persona que gane más de S/ 25,000 y tenga un score de crédito de 700 o mejor. Rechaza a todos los demás.
 */
public class VerificationCredit {

    public static double salaryRequired = 25000.00;
    public static int scoreCreditRequired = 700;

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double salary = getSalary();
        int score = getScoreCredit();

        boolean isQualified = isAQualifiedUser(salary, score);

        System.out.println("Is a Qualified User: " + isQualified);
        notifyUser(isQualified);

    }

    public static double getSalary() {
        System.out.println("Insert salary:");
        return scanner.nextDouble();
    }

    public static int getScoreCredit() {
        System.out.println("Insert Score:");
        return scanner.nextInt();
    }

    public static boolean isAQualifiedUser(double salary, int score) {
        /* if (salary >= salaryRequired && score >= scoreCreditRequired) {
            return true;
        } else {
            return false;
        }*/
        return salary >= salaryRequired && score >= scoreCreditRequired;
    }

    public static void notifyUser(boolean isQualified) {
        /*if (isQualified)  {
            System.out.println("Congratulations, you have approved the credit");
        } else {
            System.out.println("Sorry, for another chance");
        }*/
        System.out.println(isQualified ? "Congratulations, you have approved the credit"
                : "Sorry, for another chance");
    }
}
