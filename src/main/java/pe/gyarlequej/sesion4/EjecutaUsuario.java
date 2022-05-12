package pe.gyarlequej.sesion4;

public class EjecutaUsuario {

    public static void main(String[] args) {
        // TipoDeDato nombreVariable
        // int numero;
        Usuario usuarioPrincipal = new Usuario("Giancarlo Elvis", "Yarlequé Juárez");
        // usuarioPrincipal.nombres = "Giancarlo Elvis";
        // usuarioPrincipal.apellidos = "Yarleque Juarez";
        usuarioPrincipal.setCodigo("0512007017");
        usuarioPrincipal.setEdad(28);

        System.out.println(usuarioPrincipal.getNombres());
        System.out.println(usuarioPrincipal.getApellidos());
        System.out.println(usuarioPrincipal.getCodigo());
        System.out.println(usuarioPrincipal.getEdad());

        System.out.println(usuarioPrincipal);

        Usuario usuarioSecundario = new Usuario("Giancarlo Elvis");
        Usuario usuarioTerciario = new Usuario("Giancarlo Elvis", "Yarleque Juarez", "0572007017", 28);
        Usuario usuario4 = new Usuario("Giancarlo Elvis", "Yarlequé J.");
        usuario4.setEdad(28);
        usuario4.setCodigo("xxxxxxx");

        System.out.println(usuarioSecundario);
        System.out.println(usuarioTerciario);
        System.out.println(usuario4);



    }
}
