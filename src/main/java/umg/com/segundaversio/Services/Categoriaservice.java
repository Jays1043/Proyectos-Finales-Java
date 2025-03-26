package umg.com.segundaversio.Services;

import org.springframework.stereotype.Service;
import umg.com.segundaversio.Entity.Categoria;


import java.util.List;
import java.util.Optional;

@Service
public interface Categoriaservice {
    List<Categoria> getCategoria();
    Optional<Categoria> getCategoria(int idCategoria);
    Categoria saveCategoria(Categoria newCategoria);

    void deleteCategoria(int idCategoria);
    Categoria buscarporid(int idCategoria);
}
