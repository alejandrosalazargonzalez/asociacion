
package es.ies.puerto.sistema_gestion_de_biblioteca;
import java.util.Objects;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class SalaLectura {
    String nombre;
    int capacidad;

    /**
     * Constructor vacio
     */
    public SalaLectura() {
    }

    /**
     * Constructor completo
     * @param nombre
     * @param capacidad
     */
    public SalaLectura(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    //Getters setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * metodo que reserva una sala
     * @return
     */
    public boolean reservarSala(){
        return true;
    }

    /**
     * metodo que comprueba si la sala esta disponible
     * @return
     */
    public boolean verificarDisponibilidad(){
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof SalaLectura)) {
            return false;
        }
        SalaLectura SalaLectura = (SalaLectura) o;
        return Objects.equals(nombre, SalaLectura.nombre) && capacidad == SalaLectura.capacidad;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, capacidad);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", capacidad='" + getCapacidad() + "'" +
            "}";
    }
}