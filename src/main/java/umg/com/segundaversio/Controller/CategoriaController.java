package umg.com.segundaversio.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import umg.com.segundaversio.Entity.Categoria;
import umg.com.segundaversio.Services.Categoriaservice;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/Categoria")
public class CategoriaController {
    @Autowired
    Categoriaservice categoriaservice;
    @GetMapping
    public List<Categoria> getCategoria(){return categoriaservice.getCategoria();}
    @GetMapping("/{idCategoria}")
    public Optional<Categoria> getCategoria(@PathVariable Integer idCategoria){return categoriaservice.getCategoria(idCategoria);}
    @PostMapping
    public Categoria saveCategoria(@RequestBody Categoria newCategoria){return categoriaservice.saveCategoria(newCategoria);}
    @DeleteMapping("/{idCategoria}")
    public void deleteCategoria(@PathVariable Integer idCategoria){categoriaservice.deleteCategoria(idCategoria);}
}
