package prog.ud06.actividad611.coleccion.diccionario;

import java.io.Serializable;

/**
 * Excepción de diccionario.
 * 
 * Esta excepción se utiliza para indicar errores relacionados con operaciones en el diccionario, como intentar agregar una entrada con un nombre que ya existe.
 * 
 * @author [Álvaro Díaz Casaño]
 * @version 1.0
 */
public class DiccionarioException extends RuntimeException implements Serializable {

    /**
     * Constructor por defecto.
     */
    public DiccionarioException() {
        super();
    }
}
