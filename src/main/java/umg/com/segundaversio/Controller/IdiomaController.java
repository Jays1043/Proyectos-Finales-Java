package umg.com.segundaversio.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import umg.com.segundaversio.Entity.Idioma;
import umg.com.segundaversio.Services.Idiomaservice;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/Idiomas")
public class IdiomaController {
    @Autowired
    Idiomaservice idiomaservice;
    @GetMapping
    public List<Idioma> getIdioma(){return idiomaservice.getIdioma();}
    @GetMapping("/{idIdioma}")
    public Optional<Idioma> getIdioma(@PathVariable Integer idIdioma){return idiomaservice.getIdioma(idIdioma);}
    @PostMapping
    public Idioma saveIdioma(@RequestBody Idioma newIdioma){return idiomaservice.saveIdioma(newIdioma);}
    @DeleteMapping("/{idIdioma}")
    public void deleteIdioma(@PathVariable Integer idIdioma){idiomaservice.deleteIdioma(idIdioma);}
}
