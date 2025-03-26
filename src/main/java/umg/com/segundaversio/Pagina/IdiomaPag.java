package umg.com.segundaversio.Pagina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import umg.com.segundaversio.Entity.Editorial;
import umg.com.segundaversio.Entity.Idioma;

import umg.com.segundaversio.Services.Idiomaservice;

import java.util.List;

@Controller
@RequestMapping("/idiomas")
public class IdiomaPag {
    @Autowired
    private Idiomaservice idiomaservice;
    @GetMapping
    public String getIdiomas(Model model){
        List<Idioma> idiomas = idiomaservice.getIdioma();
        model.addAttribute("idiomas", idiomas);
        return"Idioma";
    }

    @PostMapping
    public String saveIdioma(Idioma idioma){
        idiomaservice.saveIdioma(idioma);
        return "redirect:/idiomas";
    }
    @PostMapping("/delete")
    public String deleteIdioma(@RequestParam("idIdioma") Integer idIdioma) {
        idiomaservice.deleteIdioma(idIdioma);
        return "redirect:/idiomas";
    }
    @GetMapping("/Editar/{idIdioma}")
    public String Editar(@PathVariable("idIdioma") int idIdiomas, Model model) {
        Idioma idioma = idiomaservice.Obtenerid(idIdiomas);
        model.addAttribute("idioma", idioma);
        return  "Editidioma";
    }
}
