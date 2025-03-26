package umg.com.segundaversio.Btneditar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import umg.com.segundaversio.Entity.Libros;
import umg.com.segundaversio.Services.Librosservice;

@Controller
@RequestMapping("/Libro/Editar/{idLibros}")
public class Editlibro {
    @Autowired
    Librosservice librosservice;
    @PostMapping
    public String guardarLibro(Libros libros) {
        librosservice.saveLibros(libros);
        return "redirect:/Libro";
    }
}
