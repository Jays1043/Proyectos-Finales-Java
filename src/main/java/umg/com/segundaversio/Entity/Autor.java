package umg.com.segundaversio.Entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Table(name = "autor")
@Entity
@Data
public class Autor {
    @Id

    @Column(name = "idAutor")
    private int idAutores;

    @Column(name = "Nombres")
    private String Nombres;

    @Column(name = "Apelidos")
    private String Apellidos;

    @Column(name = "FechaNac")
    private LocalDate FechaNace;
}
