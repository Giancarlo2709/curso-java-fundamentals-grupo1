package pe.gyarlequej.sesion6.interfaces;

public class DataBase {

    public static void main(String[] args) {

        AccesoDatos accesoDatos = new ImplementacionMySql();
        operacionesLogging((Logger) accesoDatos);
        operacionBasicasBaseDatos(accesoDatos);

        accesoDatos = new ImplementacionOracle();
        operacionesLogging((Logger) accesoDatos);
        operacionBasicasBaseDatos(accesoDatos);

        accesoDatos = new ImplementacionMongoDB();
        operacionBasicasBaseDatos(accesoDatos);
    }

    private static void operacionBasicasBaseDatos(AccesoDatos accesoDatos) {
        accesoDatos.insertar();
        accesoDatos.listar();
        accesoDatos.actualizar();
        accesoDatos.eliminar();
    }

    private static void operacionesLogging(Logger logger) {
        logger.info();
        logger.error();
    }
}
