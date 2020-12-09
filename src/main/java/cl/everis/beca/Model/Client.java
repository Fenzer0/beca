package cl.everis.beca.Model;

import lombok.Data;
import org.springframework.context.annotation.Primary;

import javax.persistence.*;

//clase que define todos los parametros de un cliente
@Entity
@Table(name="client")
public @Data
class Client {

    //parametro que define el numero Identificador (ID) del cliente
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true,nullable = false)
    private Long id;

    //parametro que define el email del cliente
    @Column(unique = true,nullable = false)
    private String eMail;

    //parametro que define el nombre del cliente
    private String name;

    //parametro que define el apellido del cliente
    private String lastName;

    //parametro que define el RUT del cliente
    private String rut;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

}
