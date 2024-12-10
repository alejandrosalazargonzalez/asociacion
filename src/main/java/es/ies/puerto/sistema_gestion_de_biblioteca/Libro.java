
package es.ies.puerto.sistema_gestion_de_biblioteca;
import java.util.Objects;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Libro {
    private String titulo;
    private String autor;
    private Integer isbn;

    /**
     * Constructor vacio
     */
    public Libro() {
    }

    /**
     * Constructor completo
     * @param titulo
     * @param autor
     * @param isbn
     */
    public Libro(String titulo, String autor, Integer isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    //Getters setters
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getIsbn() {
        return this.isbn;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    /**
     * comprueba si un libro esta disponible
     * @return
     */
    public boolean verificarDisponibilidad()
    {
        return true;
    }

    /**
     * le da una categoria al libro
     * @return
     */
    public boolean asignarCategoria()
    {
        return true;
    }
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Libro)) {
            return false;
        }
        Libro libro = (Libro) o;
        return Objects.equals(titulo, libro.titulo) && Objects.equals(autor, libro.autor) && Objects.equals(isbn, libro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, autor, isbn);
    }

    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", autor='" + getAutor() + "'" +
            ", isbn='" + getIsbn() + "'" +
            "}";
    }
    
}
