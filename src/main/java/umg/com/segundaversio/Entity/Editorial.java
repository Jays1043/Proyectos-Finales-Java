package umg.com.segundaversio.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;


@Table(name = "editorial")
@Entity
@Data
public class Editorial {
    @Id
    @Column(name = "idEditorial")
    private Integer ideditorial;

    @Column(name = "Nombre")
    private String Nombre;

    @Column(name = "Direccion")
    private String direccion;

}
