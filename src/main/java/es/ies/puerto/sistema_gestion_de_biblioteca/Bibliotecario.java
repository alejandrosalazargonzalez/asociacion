
package es.ies.puerto.sistema_gestion_de_biblioteca;
import java.util.Objects;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Bibliotecario {
    private String nombre;
    private Integer id;


    public Bibliotecario() {
    }

    public Bibliotecario(String nombre, Integer id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * registra un libro
     * @return
     */
    public boolean registraLibros()
    {
        return true;
    }

    /**
     * Gestiona los prestamos
     * @return
     */
    public boolean gestionarPrestamos()
    {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Bibliotecario)) {
            return false;
        }
        Bibliotecario bibliotecario = (Bibliotecario) o;
        return Objects.equals(nombre, bibliotecario.nombre) && Objects.equals(id, bibliotecario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, id);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", id='" + getId() + "'" +
            "}";
    }
    
}
