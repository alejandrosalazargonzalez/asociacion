
package es.ies.puerto.sistema_gestion_de_biblioteca;
import java.util.List;
import java.util.Objects;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Categoria {
    private String nombre;
    private String descripcion;

    /**
     * Constructor vacio
     */
    public Categoria() {
    }

    /**
     * Constructor completo
     * @param nombre
     * @param descripcion
     */
    public Categoria(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    //getter y setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * le da una categoria a un libro
     * @param libro
     * @return
     */
    public boolean agregarCategoria(Libro libro)
    {
        return true;
    }

    /**
     * ordena los libros segun su categoria
     * @param libros
     * @return
     */
    public List<Libro> listarLibrosPorCategoria(List<Libro> libros)
    {
        return new List<Libro>();
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Categoria)) {
            return false;
        }
        Categoria categoria = (Categoria) o;
        return Objects.equals(nombre, categoria.nombre) && Objects.equals(descripcion, categoria.descripcion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, descripcion);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", descripcion='" + getDescripcion() + "'" +
            "}";
    }
    
}
