package umg.com.segundaversio.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import umg.com.segundaversio.Entity.Editorial;

import umg.com.segundaversio.Services.ServiceEditorial;

import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping(path = "/Editoriales")
public class EditorialController {
    @Autowired
    ServiceEditorial serviceEditorial;
    @GetMapping
    public List<Editorial> getEditorial(){return serviceEditorial.getEditoriales();}
    @GetMapping("/{idEditorial}")
    public Optional<Editorial> getEditorial(@PathVariable Integer idEditorial){return serviceEditorial.getEditorial(idEditorial);}
    @PostMapping
    public Editorial saveEditorial(@RequestBody Editorial newEditorial){return serviceEditorial.saveEditorial(newEditorial);}
    @DeleteMapping("/{idEditorial}")
    public void deleteEditorial(@PathVariable Integer idEditorial){serviceEditorial.deleteEditorial(idEditorial);}


}
