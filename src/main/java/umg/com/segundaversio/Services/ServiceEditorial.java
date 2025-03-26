package umg.com.segundaversio.Services;

import org.springframework.stereotype.Service;
import umg.com.segundaversio.Entity.Editorial;
import umg.com.segundaversio.Entity.Libros;

import java.util.List;
import java.util.Optional;

@Service
public interface ServiceEditorial {
    List<Editorial>getEditoriales();
    Optional<Editorial> getEditorial(int idEditorial);
    Editorial saveEditorial(Editorial newEditorial);

    void deleteEditorial(int idEditorial);
    Editorial Obtenerid(int idEditorial);
}
