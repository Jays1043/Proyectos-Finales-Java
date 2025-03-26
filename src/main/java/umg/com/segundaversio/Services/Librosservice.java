package umg.com.segundaversio.Services;

import org.springframework.stereotype.Service;
import umg.com.segundaversio.Entity.Autor;
import umg.com.segundaversio.Entity.Libros;

import java.util.List;
import java.util.Optional;

@Service
public interface Librosservice {
    List<Libros> getLibros();
    Optional<Libros> getLibros(int idLibros);
    Libros saveLibros(Libros newLibros);

    void deleteLibros(int idLibros);
    void EliminarLibro(Libros eleLibro);

    Libros Obtenerid(int idLibros);
}
