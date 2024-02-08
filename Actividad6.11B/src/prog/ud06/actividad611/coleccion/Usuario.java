package prog.ud06.actividad611.coleccion;

import java.util.List;

/**
 * Clase que representa a un Usuario.
 * 
 * Un Usuario tiene un identificador único, un nombre completo, una tarjeta de
 * claves y una lista de clientes.
 * 
 * @author [Álvaro Díaz Casaño]
 * @version 1.0
 */
public class Usuario {

  private String nombreUsuario;
  private String nombreCompleto;
  private TarjetaClaves tarjeta;
  private List<Cliente> clientes;

  /**
   * Crea un usuario.
   * 
   * @param nombreUsuario  Nombre de usuario único del usuario. No puede ser null
   *                       y debe tener entre 2 y 8 caracteres alfanuméricos,
   *                       siendo el primero una letra.
   * @param nombreCompleto Nombre y apellidos del usuario. No puede ser null ni
   *                       vacío.
   * @param tarjeta        Tarjeta de claves del usuario. No puede ser null.
   * @param clientes       Lista de clientes del usuario. No puede ser null aunque
   *                       puede estar vacía.
   * @throws IllegalArgumentException Si alguno de los parámetros no es correcto.
   */
  public Usuario(String nombreUsuario, String nombreCompleto, TarjetaClaves tarjeta, List<Cliente> clientes) {
    if (nombreUsuario == null || nombreUsuario.length() < 2 || nombreUsuario.length() > 8
        || !Character.isLetter(nombreUsuario.charAt(0)))
      throw new IllegalArgumentException(
          "El nombre de usuario debe tener entre 2 y 8 caracteres alfanuméricos, empezando por una letra.");
    if (nombreCompleto == null || nombreCompleto.isEmpty())
      throw new IllegalArgumentException("El nombre completo no puede ser null ni vacío.");
    if (tarjeta == null)
      throw new IllegalArgumentException("La tarjeta de claves no puede ser null.");
    if (clientes == null)
      throw new IllegalArgumentException("La lista de clientes no puede ser null.");

    this.nombreUsuario = nombreUsuario;
    this.nombreCompleto = nombreCompleto;
    this.tarjeta = tarjeta;
    this.clientes = clientes;
  }

  /**
   * Devuelve el nombre de usuario del usuario.
   * 
   * @return Nombre de usuario del usuario.
   */
  public String getNombreUsuario() {
    return nombreUsuario;
  }

  /**
   * Obtiene el nombre y apellidos del usuario.
   * 
   * @return Nombre y apellidos del usuario.
   */
  public String getNombreCompleto() {
    return nombreCompleto;
  }

  /**
   * Obtiene la tarjeta de coordenadas del usuario.
   * 
   * @return Tarjeta de coordenadas del usuario.
   */
  public TarjetaClaves getTarjeta() {
    return tarjeta;
  }

  /**
   * Obtiene la lista de clientes del usuario.
   * 
   * @return Lista de clientes del usuario.
   */
  public List<Cliente> getClientes() {
    return clientes;
  }
}