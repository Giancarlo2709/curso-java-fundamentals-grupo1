package pe.gyarlequej.sesion7;

import java.util.Map;

/*
 * A unos estudiantes se les dió un examen sorpresa, y colectivamente no lo hicieron tan bien. Como resultado, el
 * Profesor decidió darles un examen de recuperación para permitirles mejorar sus puntajes.
 * Teniendo en cuenta dos Maps de puntajes de las pruebas, actualice las calificaciones de los estudiantes solo si obtuvieron
 * mejores resultados en el examen de recuperación.
 * Imprime las calificaciones finales.
 */
public class Examen {

    public static void main(String[] args) {
        Map<String, Double> primerExamenMap = Calificacion.obtenerResultadosPrimeraCalificacion();
        Map<String, Double> examenRecuperacionMap = Calificacion.obtenerResultadosExamenRecuperacion();

        examenRecuperacionMap.forEach((name, nota) -> {
            Double notaPrimerExamen = primerExamenMap.get(name);

            if(nota > notaPrimerExamen) {
                primerExamenMap.put(name, nota);
            }
        });

        System.out.println("Imprimir Calificaciones finales: ");
        primerExamenMap.forEach((name, nota) -> System.out.println("Estudiante: " + name + "; Calificacion: " + nota));
    }
}
