package com.example.sisop.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.sisop.Entity.Articulo;
import com.example.sisop.Entity.Usuario;
import com.example.sisop.Repository.ArticuloRepository;

@Service
public class ArticuloService {
    @Autowired
    private ArticuloRepository articuloRepository;

    public List<Articulo> obtenerArticulosPorUsuario(Usuario usuario) {
        return articuloRepository.findByUsuario(usuario);
    }

    public Articulo guardarArticulo(Articulo articulo) {
        return articuloRepository.save(articulo);
    }

    public void eliminarArticulo(Long id) {
        articuloRepository.deleteById(id);
    }
}
