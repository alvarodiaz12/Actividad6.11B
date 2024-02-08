package prog.ud06.actividad611.proveedores;

import prog.ud06.actividad611.coleccion.ProveedorUsuarios;
import prog.ud06.actividad611.coleccion.ProveedorUsuariosException;
import prog.ud06.actividad611.coleccion.Usuarios;

/**
 * Implementación de ProveedorUsuarios que obtiene la información desde un archivo XML.
 * 
 * Esta clase lee la información de los usuarios desde un archivo XML y la convierte en un contenedor de usuarios.
 * 
 * @author [Álvaro Díaz Casaño]
 * @version 1.0
 */
public class ProveedorUsuariosArchivoXML implements ProveedorUsuarios {

    private String archivo;

    /**
     * Constructor.
     * 
     * @param archivo Ruta al archivo XML que contiene la información de los usuarios.
     */
    public ProveedorUsuariosArchivoXML(String archivo) {
        this.archivo = archivo;
    }

    /**
     * Obtiene los usuarios desde la fuente de datos.
     * 
     * @return Contenedor con los usuarios si todo fue OK. Vacío o incompleto en caso de error.
     * @throws ProveedorUsuariosException Si hay algún error obteniendo la información.
     */
    @Override
    public Usuarios obtieneUsuarios() throws ProveedorUsuariosException {
        // Implementación de la obtención de usuarios desde el archivo XML
        return null; // Por ahora, siempre retorna null
    }
}