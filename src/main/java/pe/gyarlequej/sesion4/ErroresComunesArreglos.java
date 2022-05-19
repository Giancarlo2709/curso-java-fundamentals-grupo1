package pe.gyarlequej.sesion4;

public class ErroresComunesArreglos {

    public static void main(String[] args) {
        int[] enteros = new int[3];
        System.out.println(enteros[2]);

        Usuario[] usuarios = new Usuario[3];
        usuarios[0] = new Usuario("Giancarlo");
        usuarios[1] = new Usuario("Lisbeidy");
        usuarios[2] = new Usuario("Haffir");

        for (Usuario user : usuarios) {
            System.out.println(user.getNombres());
        }

        int[][] matriz = new int[2][3];
        matriz[0][0]  = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[1][0] = 4;
        matriz[1][1] = 5;
        matriz[1][2] = 6;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println(matriz[i][j]);
                // matriz[0][0], matriz[0][1], matriz[0][2]
                // matriz[1][0], matriz[1][1], matriz[1][2]
            }
        }
    }
}
