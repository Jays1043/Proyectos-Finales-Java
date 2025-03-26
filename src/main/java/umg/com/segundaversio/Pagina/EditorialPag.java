package umg.com.segundaversio.Pagina;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import umg.com.segundaversio.Entity.Autor;
import umg.com.segundaversio.Entity.Editorial;

import umg.com.segundaversio.Services.ServiceEditorial;

import java.util.List;

@Controller
@RequestMapping("/Editorial")
public class EditorialPag {
    @Autowired
    private ServiceEditorial serviceEditorial;


    @PostMapping
    public String saveEditorial(Editorial editorial){
        serviceEditorial.saveEditorial(editorial);
        return "redirect:/Editorial";
    }
    @PostMapping("/delete")
    public String deleteEditorial(@RequestParam("idEditorial") Integer idEditoriales) {
        serviceEditorial.deleteEditorial(idEditoriales);
        return "redirect:/Editorial";
    }
    @GetMapping("/Editar/{idEditorial}")
    public String Editar(@PathVariable("idEditorial") int idEditoriales, Model model) {
        Editorial editorial = serviceEditorial.Obtenerid(idEditoriales);
        model.addAttribute("editorial", editorial);
        return  "Editeditorial";
    }

    @GetMapping
    public String listar(Model model) {
        List<Editorial> editorialList = serviceEditorial.getEditoriales();
        model.addAttribute("editorialList", editorialList);
        return  "Editorial";
    }
}
