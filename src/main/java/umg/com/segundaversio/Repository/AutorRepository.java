package umg.com.segundaversio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umg.com.segundaversio.Entity.Autor;

import java.util.List;

public interface AutorRepository extends JpaRepository<Autor, Integer> {

}
