package prog.ud06.actividad611.coleccion;

import java.util.ArrayList;
import java.util.List;

/**
 * Contenedor de los usuarios del sistema.
 * 
 * La clase Usuarios se encarga de almacenar y recuperar los usuarios que forman
 * el sistema.
 * 
 * @author [Álvaro Díaz Casaño]
 * @version 1.0
 */
public class Usuarios {

  private List<Usuario> listaUsuarios;

  /**
   * Constructor. Inicializa el contenedor de usuarios.
   */
  public Usuarios() {
    this.listaUsuarios = new ArrayList<>();
  }

  /**
   * Añade un nuevo usuario al contenedor.
   * 
   * @param usuario Usuario a añadir. No puede ser null.
   * @throws IllegalArgumentException Si el usuario es null.
   * @throws UsuariosException        Si ya existe un usuario en el contenedor con
   *                                  el mismo nombre de usuario que el que se
   *                                  está intentando añadir.
   */
  public void addUsuario(Usuario usuario) throws UsuariosException {
    if (usuario == null)
      throw new IllegalArgumentException("El usuario no puede ser null.");

    // Verifica si ya existe un usuario con el mismo nombre de usuario
    for (Usuario u : listaUsuarios) {
      if (u.getNombreUsuario().equals(usuario.getNombreUsuario())) {
        throw new UsuariosException("Ya existe un usuario con el mismo nombre de usuario.");
      }
    }

    // Si no hay usuarios con el mismo nombre, se añade el nuevo usuario a la lista
    listaUsuarios.add(usuario);
  }

  /**
   * Localiza un usuario por su nombre de usuario.
   * 
   * @param nombreUsuario Nombre de usuario del usuario a localizar.
   * @return El usuario si se encontró, o null si no se encontró.
   */
  public Usuario getUsuarioPorNombreUsuario(String nombreUsuario) {
    for (Usuario usuario : listaUsuarios) {
      if (usuario.getNombreUsuario().equals(nombreUsuario)) {
        return usuario;
      }
    }
    return null; // No se encontró ningún usuario con el nombre de usuario dado
  }
}
