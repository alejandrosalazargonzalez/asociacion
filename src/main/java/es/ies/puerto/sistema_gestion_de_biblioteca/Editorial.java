
package es.ies.puerto.sistema_gestion_de_biblioteca;
import java.util.Objects;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Editorial {
    
    private String nombre;
    private String direccion;
    private Integer isbn;
    private Categoria categoria;

    /**
     * Constructor vacio
     */
    public Editorial() {
    }

    /**
     * constructor completo
     * @param nombre
     * @param direccion
     * @param isbn
     * @param categoria
     */
    public Editorial(String nombre, String direccion, Integer isbn, Categoria categoria) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.isbn = isbn;
        this.categoria = categoria;
    }

    //getter setter
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getIsbn() {
        return this.isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public Categoria getCategoria() {
        return this.categoria;
    }

    /**
     * registra editorial
     * @return
     */
    public boolean registrarEditorial()
    {
        return true;
    }

    /**
     * lista los libros de la editorial
     * @return
     */
    public boolean listarLibrosEditorial()
    {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Editorial)) {
            return false;
        }
        Editorial editorial = (Editorial) o;
        return Objects.equals(nombre, editorial.nombre) && Objects.equals(direccion, editorial.direccion) && Objects.equals(isbn, editorial.isbn) && Objects.equals(categoria, editorial.categoria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, direccion, isbn, categoria);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", direccion='" + getDireccion() + "'" +
            ", isbn='" + getIsbn() + "'" +
            ", categoria='" + getCategoria() + "'" +
            "}";
    }
    
}
