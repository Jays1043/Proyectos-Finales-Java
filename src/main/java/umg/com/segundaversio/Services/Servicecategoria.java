package umg.com.segundaversio.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umg.com.segundaversio.Entity.Categoria;

import umg.com.segundaversio.Repository.CategoriaRepository;


import java.util.List;
import java.util.Optional;

@Service
public class Servicecategoria implements Categoriaservice{
    @Autowired
    CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> getCategoria(){return categoriaRepository.findAll();}
    @Override
    public Optional<Categoria> getCategoria(final int idCategoria){return categoriaRepository.findById(idCategoria);}
    @Override
    public Categoria saveCategoria(final Categoria newCategoria){return categoriaRepository.save(newCategoria);}
    @Override
    public void deleteCategoria(final int idCategoria){
        categoriaRepository.deleteById(idCategoria);}
    @Override
    public Categoria buscarporid(final int idCategoria){
        return categoriaRepository.findById(idCategoria).orElse(null);
    }
}
