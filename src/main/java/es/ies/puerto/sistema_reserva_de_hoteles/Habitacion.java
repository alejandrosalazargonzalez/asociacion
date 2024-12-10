package es.ies.puerto.sistema_reserva_de_hoteles;
import java.util.Objects;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Habitacion {
    private Integer numeroHabitacion;
    private String tipoDeHabitacion;
    private double precioNoche;

    /**
     * Constructor vacio
     */
    public Habitacion() {
    }

    /**
     * Constructor completo
     * @param numeroHabitacion
     * @param tipoDeHabitacion
     * @param precioNoche
     */
    public Habitacion(Integer numeroHabitacion, String tipoDeHabitacion, double precioNoche) {
        this.numeroHabitacion = numeroHabitacion;
        this.tipoDeHabitacion = tipoDeHabitacion;
        this.precioNoche = precioNoche;
    }

    //getter setter
    public Integer getNumeroHabitacion() {
        return this.numeroHabitacion;
    }

    public void setNumeroHabitacion(Integer numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public String getTipoDeHabitacion() {
        return this.tipoDeHabitacion;
    }

    public void setTipoDeHabitacion(String tipoDeHabitacion) {
        this.tipoDeHabitacion = tipoDeHabitacion;
    }

    public double getPrecioNoche() {
        return this.precioNoche;
    }

    public void setPrecioNoche(double precioNoche) {
        this.precioNoche = precioNoche;
    }

    /**
     * Comprueba si la habitacion esta disponible
     * @return
     */
    public boolean comprobarDisponibilidad()
    {
        return true;
    }

    /**
     * Cambia el estado de una habitacion
     * @return
     */
    public boolean cambiarEstado()
    {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Habitacion)) {
            return false;
        }
        Habitacion habitacion = (Habitacion) o;
        return Objects.equals(numeroHabitacion, habitacion.numeroHabitacion) && Objects.equals(tipoDeHabitacion, habitacion.tipoDeHabitacion) && precioNoche == habitacion.precioNoche;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroHabitacion, tipoDeHabitacion, precioNoche);
    }

    @Override
    public String toString() {
        return "{" +
            " numeroHabitacion='" + getNumeroHabitacion() + "'" +
            ", tipoDeHabitacion='" + getTipoDeHabitacion() + "'" +
            ", precioNoche='" + getPrecioNoche() + "'" +
            "}";
    }
    
}
