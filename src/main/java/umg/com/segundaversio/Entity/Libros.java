package umg.com.segundaversio.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "Libros")
@Entity
@Data
public class Libros {
    @Id
    @Column(name = "idLibros")
    private Integer idLibro;

    @Column(name = "Nombre")
    private String Nombre;

    @Column(name = "AñoEdi")
    private Integer Edi;

    @Column(name = "NumPag")
    private Integer NumPags;

    @ManyToOne
    @JoinColumn(name = "idIdioma", referencedColumnName = "idIdioma")
    private Idioma idioma;

    @ManyToOne
    @JoinColumn(name = "idEditorial", referencedColumnName = "idEditorial")
    private Editorial editorial;

    @ManyToOne
    @JoinColumn(name = "idAutor", referencedColumnName = "idAutor")
    private Autor autor;

    @ManyToOne
    @JoinColumn(name = "idCategoria", referencedColumnName = "idCategoria")
    private Categoria catego;
}
