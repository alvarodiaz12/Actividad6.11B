package prog.ud06.actividad611.coleccion;

/**
 * Tarjeta de clave de un usuario.
 * 
 * Una tarjeta de claves contiene una tabla con claves numéricas enteras.
 * 
 * @author [Álvaro Díaz Casaño]
 * @version 1.0
 */
public class TarjetaClaves {

  private int[][] tablaClaves;

  /**
   * Crea una tarjeta de claves con las filas y columnas indicadas.
   * 
   * Inicialmente todas las claves son 000.
   * 
   * @param filas    Número de filas de la tarjeta. Debe ser mayor que cero.
   * @param columnas Número de columnas de la tarjeta. Debe ser mayor que cero.
   * @throws IllegalArgumentException Si filas o columnas o ambos no son mayores
   *                                  que cero.
   */
  public TarjetaClaves(int filas, int columnas) {
    if (filas <= 0 || columnas <= 0)
      throw new IllegalArgumentException("El número de filas y columnas debe ser mayor que cero.");

    this.tablaClaves = new int[filas][columnas];
    // Inicializa todas las claves a 000
    for (int i = 0; i < filas; i++) {
      for (int j = 0; j < columnas; j++) {
        tablaClaves[i][j] = 0;
      }
    }
  }

  /**
   * Obtiene el número de filas que tiene la tabla de claves de la tarjeta.
   * 
   * @return Número de filas de la tabla de claves.
   */
  public int getFilas() {
    return tablaClaves.length;
  }

  /**
   * Obtiene el número de columnas que tiene la tabla de claves de la tarjeta.
   * 
   * @return Número de columnas de la tabla de claves.
   */
  public int getColumnas() {
    return tablaClaves[0].length;
  }

  /**
   * Modifica el valor de una clave.
   * 
   * @param fila    Fila donde está la clave. Debe valer entre 1 y el total de
   *                filas de la tarjeta.
   * @param columna Columna donde está la clave. Debe valer entre 1 y el total de
   *                columnas de la tarjeta.
   * @param clave   Nuevo valor de la clave. Debe estar comprendido entre 0 y 999,
   *                ambos incluidos.
   * @throws IllegalArgumentException Si fila, columna o clave son incorrectos.
   */
  public void setClave(int fila, int columna, int clave) {
    if (fila < 1 || fila > tablaClaves.length || columna < 1 || columna > tablaClaves[0].length || clave < 0
        || clave > 999)
      throw new IllegalArgumentException("Fila, columna o clave incorrectos.");

    tablaClaves[fila - 1][columna - 1] = clave;
  }

  /**
   * Valida que la clave es correcta.
   * 
   * @param fila    Número de fila de la clave. Debe valer desde 1 hasta el número
   *                de filas de la tarjeta.
   * @param columna Número de columna de la clave. Debe valer desde 1 hasta el
   *                número de columnas de la tarjeta.
   * @param clave   Valor de clave a validar.
   * @return true si la clave es válida, false si no lo es.
   * @throws IllegalArgumentException Si fila o columna no son válidos.
   */
  public boolean validarClave(int fila, int columna, int clave) {
    if (fila < 1 || fila > tablaClaves.length || columna < 1 || columna > tablaClaves[0].length)
      throw new IllegalArgumentException("Fila o columna no válidos.");

    return tablaClaves[fila - 1][columna - 1] == clave;
  }
}

