package es.ies.puerto.sistema_reserva_de_hoteles;
import java.util.Objects;


/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Reserva {
    private Fecha fechaEntrada;
    private Fecha fechaSalida;
    private Cliente cliente;
    private Habitacion habitacion;


    public Reserva() {
    }

    public Reserva(Fecha fechaEntrada, Fecha fechaSalida, Cliente cliente, Habitacion habitacion) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.cliente = cliente;
        this.habitacion = habitacion;
    }

    public Fecha getFechaEntrada() {
        return this.fechaEntrada;
    }

    public void setFechaEntrada(Fecha fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Fecha getFechaSalida() {
        return this.fechaSalida;
    }

    public void setFechaSalida(Fecha fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Habitacion getHabitacion() {
        return this.habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Reserva fechaEntrada(Fecha fechaEntrada) {
        setFechaEntrada(fechaEntrada);
        return this;
    }

    /**
     * Calcula cuanto cuesta el total de la reserva
     * @return
     */
    public double calcularCostoTotal()
    {
        return 10000.00;
    }

    /**
     * Confirma la reserva de una habitacion
     * @return
     */
    public boolean confirmarReserva()
    {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Reserva)) {
            return false;
        }
        Reserva reserva = (Reserva) o;
        return Objects.equals(fechaEntrada, reserva.fechaEntrada) && Objects.equals(fechaSalida, reserva.fechaSalida) && Objects.equals(cliente, reserva.cliente) && Objects.equals(habitacion, reserva.habitacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaEntrada, fechaSalida, cliente, habitacion);
    }

    @Override
    public String toString() {
        return "{" +
            " fechaEntrada='" + getFechaEntrada() + "'" +
            ", fechaSalida='" + getFechaSalida() + "'" +
            ", cliente='" + getCliente() + "'" +
            ", habitacion='" + getHabitacion() + "'" +
            "}";
    }
    

}
