package umg.com.segundaversio.Services;

import org.springframework.stereotype.Service;
import umg.com.segundaversio.Entity.Idioma;
import umg.com.segundaversio.Entity.Libros;

import java.util.List;
import java.util.Optional;

@Service
public interface Idiomaservice {
    List<Idioma> getIdioma();
    Optional<Idioma> getIdioma(int idIdioma);
    Idioma saveIdioma(Idioma newIdioma);

    void deleteIdioma(int idIdioma);
    Idioma Obtenerid(int idIdioma);
}
