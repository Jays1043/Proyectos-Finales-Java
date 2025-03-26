package umg.com.segundaversio.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Table(name = "idioma")
@Entity
@Data
public class Idioma {
    @Id

    @Column(name = "idIdioma")
    private Integer idIdioma;

    @Column(name = "Idioma")
    private String Idiomas;

}
