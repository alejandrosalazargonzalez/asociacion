
package es.ies.puerto.sistema_gestion_de_biblioteca;
import java.util.Objects;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Prestamo {
    private Fecha fechaPrestamo;
    private Fecha fechaDevolucion;
    Libro libro;
    Miembro miembro;

    /**
     * constructor completo
     */
    public Prestamo() {
    }

    /**
     * Constructor completo
     * @param fechaPrestamo
     * @param fechaDevolucion
     * @param libro
     * @param miembro
     */
    public Prestamo(Fecha fechaPrestamo, Fecha fechaDevolucion, Libro libro, Miembro miembro) {
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.libro = libro;
        this.miembro = miembro;
    }

    /**
     * getter setter
     * @return
     */
    public Fecha getFechaPrestamo() {
        return this.fechaPrestamo;
    }

    public void setFechaPrestamo(Fecha fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public Fecha getFechaDevolucion() {
        return this.fechaDevolucion;
    }

    public void setFechaDevolucion(Fecha fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public Libro getLibro() {
        return this.libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Miembro getMiembro() {
        return this.miembro;
    }

    public void setMiembro(Miembro miembro) {
        this.miembro = miembro;
    }

    /**
     * Metodo que calcula la multa por entregar un libro retrasado
     * @param fechaActual
     * @return
     */
    public double calcularMultaPorRetraso(Fecha fechaActual)
    {
        return 1000.00;
    }

    /**
     * Metodo que marca un libro como devuelto
     * @return
     */
    public boolean marcarComoDevuelto()
    {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Prestamo)) {
            return false;
        }
        Prestamo prestamo = (Prestamo) o;
        return Objects.equals(fechaPrestamo, prestamo.fechaPrestamo) && Objects.equals(fechaDevolucion, prestamo.fechaDevolucion) && Objects.equals(libro, prestamo.libro) && Objects.equals(miembro, prestamo.miembro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaPrestamo, fechaDevolucion, libro, miembro);
    }

    @Override
    public String toString() {
        return "{" +
            " fechaPrestamo='" + getFechaPrestamo() + "'" +
            ", fechaDevolucion='" + getFechaDevolucion() + "'" +
            ", libro='" + getLibro() + "'" +
            ", miembro='" + getMiembro() + "'" +
            "}";
    }
}
