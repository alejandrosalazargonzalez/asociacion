
package es.ies.puerto.sistema_gestion_de_biblioteca;
import java.util.List;
import java.util.Objects;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Miembro{
    
    private String nombre;
    private Integer id;
    List<Prestamo> historialPrestamos;

    /**
     * Constructor vacio
     */
    public Miembro() {
    }

    /**
     * Constructor completo
     * @param nombre
     * @param id
     * @param historialPrestamos
     */
    public Miembro(String nombre, Integer id, List<Prestamo> historialPrestamos) {
        this.nombre = nombre;
        this.id = id;
        this.historialPrestamos = historialPrestamos;
    }

    //getter setter
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

    public List<Prestamo> getHistorialPrestamos() {
        return this.historialPrestamos;
    }

    public void setHistorialPrestamos(List<Prestamo> historialPrestamos) {
        this.historialPrestamos = historialPrestamos;
    }

    /**
     * metodo que registra a un miembro
     * @return
     */
    public boolean registrarMiembro()
    {
        return true;
    }

    /**
     * Muestra el historial de Prestamos
     * @return
     */
    public boolean verHistorial()
    {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Miembro)) {
            return false;
        }
        Miembro miembro = (Miembro) o;
        return Objects.equals(nombre, miembro.nombre) && Objects.equals(id, miembro.id) && Objects.equals(historialPrestamos, miembro.historialPrestamos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, id, historialPrestamos);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", id='" + getId() + "'" +
            ", historialPrestamos='" + getHistorialPrestamos() + "'" +
            "}";
    }

}