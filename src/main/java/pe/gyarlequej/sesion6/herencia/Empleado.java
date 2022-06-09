package pe.gyarlequej.sesion6.herencia;

public class Empleado extends Persona {

    private String idEmpleado;
    private String cargo;

    public Empleado(String nombre, int edad,  String idEmpleado, String cargo) {
        super(nombre, edad);
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empleado{");
        sb.append("idEmpleado='").append(idEmpleado).append('\'');
        sb.append(", cargo='").append(cargo).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
