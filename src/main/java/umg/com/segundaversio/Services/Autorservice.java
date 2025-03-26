package umg.com.segundaversio.Services;

import org.springframework.stereotype.Service;
import umg.com.segundaversio.Entity.Autor;
import umg.com.segundaversio.Entity.Categoria;

import java.util.List;
import java.util.Optional;

@Service
public interface Autorservice {
    List<Autor> getAutor();

    Optional<Autor> getAutor(int idAutor);

    Autor saveAutor(Autor newAutor);

    void deleteAutor(int idAutor);

    Autor buscarporid(int idAutor);

}
