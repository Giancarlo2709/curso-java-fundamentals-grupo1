package pe.gyarlequej.sesion7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejarExcepcion {

    public static void main(String[] args) {
        // crearNuevoArchivo();
        numerosManejarExcepciones();
    }

    private static void numerosManejarExcepciones() {
        File file = new File("numeros.txt");

        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);
            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch(FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        } finally {
            fileReader.close();
        }

    }

    private static void crearNuevoArchivo(){

        File file = new File("resources/noexiste.txt");

        try {
            file.createNewFile();
        } catch (IOException exception) {
            System.out.println("El directorio no existe");
            //exception.printStackTrace();
        }


    }
}
