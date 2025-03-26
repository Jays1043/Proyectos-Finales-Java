package umg.com.segundaversio.Pagina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import umg.com.segundaversio.Entity.Autor;
import umg.com.segundaversio.Entity.Libros;
import umg.com.segundaversio.Services.Librosservice;

import java.util.List;

@Controller
@RequestMapping("/Libro")
public class LibrosPag {
    @Autowired
    Librosservice librosservice;

    @GetMapping
    public String getLibros(Model model) {
        List<Libros> libros = librosservice.getLibros();
        model.addAttribute("libros", libros);
        return "Libro";
    }

    @PostMapping
    public String saveLibros(Libros libros) {
        librosservice.saveLibros(libros);
        return "redirect:/Libro";
    }

    @PostMapping("/delete")
    public String deleteibro(@RequestParam("idLibros") Integer idLibros) {
        librosservice.deleteLibros(idLibros);
        return "redirect:/Libro";
    }

    @GetMapping("/Editar/{idLibros}")
    public String Editar(@PathVariable("idLibros") int idLibros, Model model) {
        Libros libros = librosservice.Obtenerid(idLibros);
        model.addAttribute("libross", libros);
        return "Editlibro";
    }

}


