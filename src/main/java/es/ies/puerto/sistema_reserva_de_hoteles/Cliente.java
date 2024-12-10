
package es.ies.puerto.sistema_reserva_de_hoteles;
import java.util.Objects;

/**
 *  @author: alejandrosalazargonzalez
 *  @version: 1.0.0
 */
public class Cliente {
    private String nombre;
    private Integer numeroTelefono;
    private String correoElectronico;

    /**
     * Constructor vacio
     */
    public Cliente() {
    }

    /**
     * Constructor completo
     * @param nombre
     * @param numeroTelefono
     * @param correoElectronico
     */
    public Cliente(String nombre, Integer numeroTelefono, String correoElectronico) {
        this.nombre = nombre;
        this.numeroTelefono = numeroTelefono;
        this.correoElectronico = correoElectronico;
    }

    //getter setter
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNumeroTelefono() {
        return this.numeroTelefono;
    }

    public void setNumeroTelefono(Integer numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getCorreoElectronico() {
        return this.correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    /**
     * registra al ciente
     * @return
     */
    public boolean registrarCliente()
    {
        return true;
    }

    /**
     * muestra la obtenerInformacion del cliente
     * @return
     */
    public boolean obtenerInformacion()
    {
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cliente)) {
            return false;
        }
        Cliente cliente = (Cliente) o;
        return Objects.equals(nombre, cliente.nombre) && Objects.equals(numeroTelefono, cliente.numeroTelefono) && Objects.equals(correoElectronico, cliente.correoElectronico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, numeroTelefono, correoElectronico);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", numeroTelefono='" + getNumeroTelefono() + "'" +
            ", correoElectronico='" + getCorreoElectronico() + "'" +
            "}";
    }
    
}
