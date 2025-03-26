package umg.com.segundaversio.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Table(name = "Categoria")
@Entity
@Data
public class Categoria {
    @Id

    @Column(name = "idCategoria")
    private Integer idCategoria;

    @Column(name = "Nombre")
    private String Nombre;


}
