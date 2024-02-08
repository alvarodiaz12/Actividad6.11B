package prog.ud06.actividad611.coleccion;

import java.io.Serializable;

/**
 * Excepción general que lanzan todos los ProveedoresUsuarios cuando ocurre algún error.
 * 
 * Esta excepción se utiliza para manejar errores generales que puedan ocurrir durante la obtención de información de los usuarios desde una fuente externa.
 * 
 * @author [Álvaro Díaz Casaño]
 * @version 1.0
 */
public class ProveedorUsuariosException extends Exception implements Serializable {

    /**
     * Constructor por defecto.
     */
    public ProveedorUsuariosException() {
        super();
    }
}


