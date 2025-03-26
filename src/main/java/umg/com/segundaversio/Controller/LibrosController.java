package umg.com.segundaversio.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import umg.com.segundaversio.Entity.Libros;
import umg.com.segundaversio.Services.Librosservice;


import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/Libros")
public class LibrosController {
    @Autowired
    Librosservice librosservice;
    @GetMapping
    public List<Libros> getLibros(){return librosservice.getLibros();}
    @GetMapping("/{idLibros}")
    public Optional<Libros> getLibros(@PathVariable Integer idLibros){return librosservice.getLibros(idLibros);}
    @PostMapping
    public Libros saveLibros(@RequestBody Libros newLibros){return librosservice.saveLibros(newLibros);}
    @DeleteMapping("/{idLibros}")
    public void deleteLibros(@PathVariable Integer idLibros){librosservice.deleteLibros(idLibros);}
}
