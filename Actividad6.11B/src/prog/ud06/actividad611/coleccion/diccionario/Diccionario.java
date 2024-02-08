package prog.ud06.actividad611.coleccion.diccionario;

/**
 * Clase que implementa un diccionario.
 * 
 * Un diccionario guarda cosas de un tipo determinado (Tipo Genérico V) con un nombre (String).
 * 
 * @param <V> Tipo de los elementos a guardar en el diccionario.
 * @author [Álvaro Díaz Casaño]
 * @version 1.0
 */
public class Diccionario<V> {

    /**
     * Constructor. Crea un diccionario vacío.
     */
    public Diccionario() {
        // Constructor vacío
    }

    /**
     * Comprueba si existe una entrada en el diccionario con el nombre dado.
     * 
     * @param nombre Nombre de la entrada a comprobar.
     * @return true si existe en el diccionario una entrada con el nombre proporcionado, false si no existe.
     */
    public boolean contieneNombre(String nombre) {
        // Implementación de la comprobación de existencia de la entrada con el nombre dado
        return false; // Por ahora, siempre retorna false
    }

    /**
     * Añade una nueva entrada al diccionario.
     * 
     * @param nombre Nombre de la entrada a añadir. No puede ser null ni coincidir con el nombre de una entrada ya existente en el diccionario.
     * @param valor  Valor a almacenar en la entrada. No puede ser null.
     * @throws DiccionarioException      Si ya existe previamente una entrada con el nombre proporcionado en el diccionario.
     * @throws IllegalArgumentException Si el nombre o el valor son null.
     */
    public void add(String nombre, V valor) throws DiccionarioException, IllegalArgumentException {
        // Implementación de la adición de una nueva entrada al diccionario
    }

    /**
     * Obtiene el valor almacenado en una entrada del diccionario a partir de su nombre.
     * 
     * @param nombre Nombre de la entrada a recuperar.
     * @return Valor almacenado en la entrada con el nombre proporcionado. Si no existe una entrada con dicho nombre devuelve null.
     */
    public V getEntrada(String nombre) {
        // Implementación de la obtención del valor de una entrada del diccionario a partir de su nombre
        return null; // Por ahora, siempre retorna null
    }
}

