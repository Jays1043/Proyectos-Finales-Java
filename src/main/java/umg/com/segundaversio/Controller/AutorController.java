package umg.com.segundaversio.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import umg.com.segundaversio.Entity.Autor;
import umg.com.segundaversio.Services.Autorservice;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/Autores")
public class AutorController {
    @Autowired
    Autorservice autorservice;
    @GetMapping
    public List<Autor> getAutor(){return autorservice.getAutor();}
    @GetMapping("/{idAutor}")
    public Optional<Autor> getAutores(@PathVariable Integer idAutor){return autorservice.getAutor(idAutor);}
    @PostMapping
    public Autor saveAutor(@RequestBody Autor newAutor){return autorservice.saveAutor(newAutor);}
    @DeleteMapping("/{idAutor}")
    public void deleteAutor(@PathVariable Integer idAutor){autorservice.deleteAutor(idAutor);}


    }
