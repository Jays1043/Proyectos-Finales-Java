package umg.com.segundaversio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import umg.com.segundaversio.Entity.Libros;

public interface LibrosRepository extends JpaRepository<Libros, Integer> {

}
