package umg.com.segundaversio.Btneditar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import umg.com.segundaversio.Entity.Autor;
import umg.com.segundaversio.Services.Autorservice;
@Controller
@RequestMapping("/Autor/Editar/{idAutor}")
public class Editarautroes {
    @Autowired
    private Autorservice autorservice;
    @PostMapping
    public String guardarAutor( Autor autores) {

        autorservice.saveAutor(autores);

        return "redirect:/Autor";
    }
}
