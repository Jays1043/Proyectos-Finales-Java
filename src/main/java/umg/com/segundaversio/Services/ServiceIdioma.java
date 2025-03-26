package umg.com.segundaversio.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umg.com.segundaversio.Entity.Autor;
import umg.com.segundaversio.Entity.Idioma;
import umg.com.segundaversio.Repository.IdiomaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceIdioma implements Idiomaservice {
    @Autowired
    IdiomaRepository idiomaRepository;

    @Override
    public List<Idioma> getIdioma(){return idiomaRepository.findAll();}
    @Override
    public Optional<Idioma> getIdioma(final int idIdioma){return idiomaRepository.findById(idIdioma);}
    @Override
    public Idioma saveIdioma(final Idioma newIdioma){return idiomaRepository.save(newIdioma);}
    @Override
    public void deleteIdioma(final int idIdioma){
        idiomaRepository.deleteById(idIdioma);}
    @Override
    public Idioma Obtenerid(int idIdioma){return  idiomaRepository.findById(idIdioma).orElse(null);}
}
