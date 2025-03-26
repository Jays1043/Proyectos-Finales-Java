package com.example.sisop.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.sisop.Entity.Articulo;
import com.example.sisop.Entity.Usuario;

@Repository
public interface ArticuloRepository extends JpaRepository<Articulo, Long> {
    List<Articulo> findByUsuario(Usuario usuario);
}
