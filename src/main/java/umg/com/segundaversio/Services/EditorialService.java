package umg.com.segundaversio.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import umg.com.segundaversio.Entity.Editorial;
import umg.com.segundaversio.Entity.Libros;
import umg.com.segundaversio.Repository.EditorialRepository;

import java.util.List;
import java.util.Optional;
@Service
public class EditorialService implements ServiceEditorial{
    @Autowired
    EditorialRepository editorialrepostery;

    @Override
    public List<Editorial> getEditoriales(){return editorialrepostery.findAll();}
    @Override
    public Optional<Editorial> getEditorial(final int idEditorial){return editorialrepostery.findById(idEditorial);}
    @Override
    public Editorial saveEditorial(final Editorial newEditorial){return editorialrepostery.save(newEditorial);}
    @Override
    public void deleteEditorial(final int idEditorial){editorialrepostery.deleteById(idEditorial);}
    @Override
    public Editorial Obtenerid(int idEditorial){return  editorialrepostery.findById(idEditorial).orElse(null);}
}
