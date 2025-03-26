package umg.com.segundaversio.Pagina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import umg.com.segundaversio.Entity.Autor;
import umg.com.segundaversio.Entity.Categoria;

import umg.com.segundaversio.Services.Categoriaservice;

import java.util.List;

@Controller
@RequestMapping("/Categorias")
public class CategoriaPag {
    @Autowired
    private Categoriaservice categoriaservice;
    @GetMapping
    public String getCategoria(Model model){
        List<Categoria> categoriaList = categoriaservice.getCategoria();
        model.addAttribute("categoriaList", categoriaList);
        return"Categoria";
    }

    @PostMapping
    public String saveCategoria(Categoria categoria){
        categoriaservice.saveCategoria(categoria);
        return "redirect:/Categorias";
    }
    @PostMapping("/delete")
    public String deleteCategoria(@RequestParam("idCategoria") Integer idCategoria) {
        categoriaservice.deleteCategoria(idCategoria);
        return "redirect:/Categorias";
    }
    @GetMapping("/Editar/{idCategoria}")
    public String Editar(@PathVariable("idCategoria") int idCategoria, Model model) {
        Categoria categoria = categoriaservice.buscarporid(idCategoria);
        model.addAttribute("categoria", categoria);
        return  "EditCategoria";
    }
}
