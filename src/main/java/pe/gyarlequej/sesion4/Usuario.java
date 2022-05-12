package pe.gyarlequej.sesion4;

public class Usuario {

    private String nombres;
    private String apellidos;
    private String codigo;
    private int edad;

    public Usuario(String nombres) {
        this.nombres = nombres;
    }

    public Usuario(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public Usuario(String nombres, String apellidos, String codigo, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.codigo = codigo;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", codigo='" + codigo + '\'' +
                ", edad=" + edad +
                '}';
    }
}
