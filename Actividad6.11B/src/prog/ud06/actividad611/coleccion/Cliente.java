package prog.ud06.actividad611.coleccion;

/**
 * Un cliente de la empresa.
 * 
 * @author [Tu nombre]
 * @version 1.0
 */
public class Cliente implements Comparable<Cliente> {

  private String nombre;
  private String apellidos;
  private String dni;
  private int edad;

  /**
   * Constructor de Cliente.
   * 
   * @param nombre    Nombre de pila de la persona. No puede ser null o vacío o
   *                  contener sólo espacios.
   * @param apellidos Apellidos de la persona. No puede ser null o vacío o
   *                  contener sólo espacios.
   * @param dni       DNI de la persona. No puede ser null y debe constar de 8
   *                  números y una letra. La letra debe ser mayúscula y válida
   *                  según las normas del DNI.
   * @param edad      Edad de la persona. Debe ser 0 ó superior.
   * @throws IllegalArgumentException Si alguno de los parámetros no es correcto.
   */
  public Cliente(String nombre, String apellidos, String dni, int edad) {
    if (nombre == null || nombre.trim().isEmpty())
      throw new IllegalArgumentException("El nombre no puede ser null o vacío");
    if (apellidos == null || apellidos.trim().isEmpty())
      throw new IllegalArgumentException("Los apellidos no pueden ser null o vacíos");
    if (dni == null || dni.length() != 9 || !dni.matches("\\d{8}[A-Z]"))
      throw new IllegalArgumentException("El DNI debe constar de 8 números seguidos de una letra mayúscula");
    if (edad < 0)
      throw new IllegalArgumentException("La edad debe ser 0 o superior");

    this.nombre = nombre;
    this.apellidos = apellidos;
    this.dni = dni;
    this.edad = edad;
  }

  /**
   * Obtiene el nombre de pila del cliente.
   * 
   * @return Nombre de pila del cliente.
   */
  public String getNombre() {
    return nombre;
  }

  /**
   * Obtiene los apellidos del cliente.
   * 
   * @return Apellidos del cliente.
   */
  public String getApellidos() {
    return apellidos;
  }

  /**
   * Obtiene el DNI del cliente.
   * 
   * @return DNI del cliente.
   */
  public String getDni() {
    return dni;
  }

  /**
   * Obtiene la edad del cliente.
   * 
   * @return Edad del cliente.
   */
  public int getEdad() {
    return edad;
  }

  /**
   * Compara este cliente con otro cliente basado en sus nombres completos.
   * 
   * @param o Cliente a comparar.
   * @return Un valor negativo, cero o un valor positivo si este cliente es menor,
   *         igual o mayor que el cliente dado.
   */
  @Override
  public int compareTo(Cliente o) {
    // Comparación basada en los nombres completos
    String nombreCompleto = this.nombre + " " + this.apellidos;
    String nombreCompletoOtro = o.getNombre() + " " + o.getApellidos();
    return nombreCompleto.compareTo(nombreCompletoOtro);
  }
}
