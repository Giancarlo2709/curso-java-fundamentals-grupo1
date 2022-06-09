package pe.gyarlequej.sesion6.interfaces;

public interface AccesoDatos {

    int MAX_REGISTRO = 10;

    void insertar();

    void listar();

    void actualizar();

    void eliminar();
}
