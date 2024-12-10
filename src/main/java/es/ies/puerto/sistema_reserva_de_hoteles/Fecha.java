package es.ies.puerto.sistema_reserva_de_hoteles;
import java.util.Objects;


/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Fecha {
    private Integer dia;
    private Integer mes;
    private Integer anio;

    /**
     * Constructor vacio
     */
    public Fecha() {
    }

    /**
     * Constructor completo
     * @param dia
     * @param mes
     * @param anio
     */
    public Fecha(Integer dia, Integer mes, Integer anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    //getter setter
    public Integer getDia() {
        return this.dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return this.mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAnio() {
        return this.anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Fecha)) {
            return false;
        }
        Fecha fecha = (Fecha) o;
        return Objects.equals(dia, fecha.dia) && Objects.equals(mes, fecha.mes) && Objects.equals(anio, fecha.anio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dia, mes, anio);
    }

    @Override
    public String toString() {
        return "{" +
            " dia='" + getDia() + "'" +
            ", mes='" + getMes() + "'" +
            ", anio='" + getAnio() + "'" +
            "}";
    }

    
}
