package prog.ud06.actividad611.coleccion;

import java.io.Serializable;

/**
 * Excepción lanzada por el contenedor de usuarios.
 * 
 * Esta excepción se utiliza para indicar errores relacionados con operaciones
 * en el contenedor de usuarios, como intentar agregar un usuario que ya existe
 * o intentar acceder a un usuario que no existe.
 * 
 * @author [Álvaro Díaz Casaño]
 * @version 1.0
 */
public class UsuariosException extends RuntimeException implements Serializable {

  /**
   * Constructor por defecto.
   * @param string 
   */
  public UsuariosException(String string) {
    super();
  }
}
