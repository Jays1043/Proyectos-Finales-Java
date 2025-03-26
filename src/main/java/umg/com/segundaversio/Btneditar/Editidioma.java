package umg.com.segundaversio.Btneditar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import umg.com.segundaversio.Entity.Idioma;
import umg.com.segundaversio.Services.Idiomaservice;

@Controller
@RequestMapping("/idiomas/Editar/{idIdioma}")
public class Editidioma {
    @Autowired
    private Idiomaservice idiomaservice;
    @PostMapping
    public String guardaridioma(Idioma idioma) {
        idiomaservice.saveIdioma(idioma);
        return "redirect:/idiomas";
    }
}
