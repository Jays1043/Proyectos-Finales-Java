package umg.com.segundaversio.Pagina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import umg.com.segundaversio.Entity.Autor;
import umg.com.segundaversio.Entity.Libros;
import umg.com.segundaversio.Services.Autorservice;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/Autor")
public class AutoresPag {
    @Autowired
    private Autorservice autorservice;

    @GetMapping
    public String getAutores(Model model) {
        List<Autor> autorList = autorservice.getAutor();
        model.addAttribute("autorList", autorList);
        return "Autor";
    }

    @PostMapping
    public String saveAutor(Autor autor) {
        autorservice.saveAutor(autor);
        return "redirect:/Autor";
    }

    @PostMapping("/delete")
    public String deleteAutor(@RequestParam("idAutor") Integer idAutor) {
        autorservice.deleteAutor(idAutor);
        return "redirect:/Autor";
    }

    /* @PostMapping("/Editar")
     public String EditarAutor(@RequestParam("idAutor") Integer idAutor) {
         autorservice.editarAutor(Autor autor);
         return "redirect:/Autor";
     }

     */
    @GetMapping("/Editar/{idAutor}")
    public String Editar(@PathVariable("idAutor") int idAutor, Model model) {
        Autor autor = autorservice.buscarporid(idAutor);
        model.addAttribute("autores", autor);
        return "EditAutor";
    }
    
   

}
