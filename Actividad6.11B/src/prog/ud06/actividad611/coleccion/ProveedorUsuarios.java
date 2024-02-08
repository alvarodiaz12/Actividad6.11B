package prog.ud06.actividad611.coleccion;

/**
 * Interface que implementan las clases que proveen (obtienen) la información de los usuarios desde una fuente externa (archivo, base de datos, etc.).
 * 
 * Esta interfaz define un método para obtener los usuarios desde la fuente de datos.
 * 
 * @author [Álvaro Díaz Casaño]
 * @version 1.0
 */
public interface ProveedorUsuarios {

    /**
     * Obtiene los usuarios desde la fuente de datos.
     * 
     * @return Contenedor con los usuarios si todo fue OK. Vacío o incompleto en caso de error.
     * @throws ProveedorUsuariosException Si hay algún error obteniendo la información.
     */
    Usuarios obtieneUsuarios() throws ProveedorUsuariosException;
}

