package umg.com.segundaversio.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umg.com.segundaversio.Entity.Autor;
import umg.com.segundaversio.Entity.Categoria;
import umg.com.segundaversio.Repository.AutorRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceAutor implements Autorservice {
    @Autowired
    AutorRepository autorRepository;

    @Override
    public List<Autor> getAutor() {
        return autorRepository.findAll();
    }

    @Override
    public Optional<Autor> getAutor(final int idAutor) {
        return autorRepository.findById(idAutor);
    }

    @Override
    public Autor saveAutor(final Autor newAutor) {
        return autorRepository.save(newAutor);
    }

    @Override
    public void deleteAutor(final int idAutor) {
        autorRepository.deleteById(idAutor);
    }

    @Override
    public Autor buscarporid(final int idAutor){
        return autorRepository.findById(idAutor).orElse(null);
    }



}
