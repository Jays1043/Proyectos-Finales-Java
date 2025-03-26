package umg.com.segundaversio.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umg.com.segundaversio.Entity.Autor;
import umg.com.segundaversio.Entity.Libros;

import umg.com.segundaversio.Repository.LibrosRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceLibros implements Librosservice{
    @Autowired
    LibrosRepository librosRepository;

    @Override
    public List<Libros> getLibros(){return librosRepository.findAll();}
    @Override
    public Optional<Libros> getLibros(final int idLibros){return librosRepository.findById(idLibros);}
    @Override
    public Libros saveLibros(final Libros newLibros){return librosRepository.save(newLibros);}
    @Override
    public void deleteLibros(final int idLibros){
        librosRepository.deleteById(idLibros);}

    @Override
    public void EliminarLibro(final Libros eliLibro){librosRepository.delete(eliLibro);}
    @Override
    public Libros Obtenerid(int idLibros){return  librosRepository.findById(idLibros).orElse(null);}
}
