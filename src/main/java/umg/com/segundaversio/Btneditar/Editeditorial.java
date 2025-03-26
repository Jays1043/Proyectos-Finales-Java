package umg.com.segundaversio.Btneditar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import umg.com.segundaversio.Entity.Editorial;
import umg.com.segundaversio.Services.ServiceEditorial;

@Controller
@RequestMapping("/Editorial/Editar/{idEditorial}")
public class Editeditorial {
    @Autowired
    private ServiceEditorial serviceEditorial;
    @PostMapping
    public String guardarEditorial( Editorial editorial) {

        serviceEditorial.saveEditorial(editorial);

        return "redirect:/Editorial";
    }
}
