package umg.com.segundaversio.Btneditar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import umg.com.segundaversio.Entity.Categoria;
import umg.com.segundaversio.Services.Categoriaservice;

@Controller
@RequestMapping("/Categorias/Editar/{idCategoria}")
public class Editcategoria {
    @Autowired
    private Categoriaservice categoriaservice;
    @PostMapping
    public String guardarAutor( Categoria categoria) {

        categoriaservice.saveCategoria(categoria);

        return "redirect:/Categorias";
    }
}
