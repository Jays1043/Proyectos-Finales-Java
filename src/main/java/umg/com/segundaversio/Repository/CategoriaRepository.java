package umg.com.segundaversio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umg.com.segundaversio.Entity.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
}
