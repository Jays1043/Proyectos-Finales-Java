package com.example.sisop.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.sisop.Entity.Articulo;
import com.example.sisop.Entity.Usuario;
import com.example.sisop.Service.ArticuloService;
import com.example.sisop.Service.UsuarioService;



@Controller
@RequestMapping("/articulos")
public class ArticuloController {

    @Autowired
    private ArticuloService articuloService;
    private UsuarioService usuarioService;

    @GetMapping
    public String listarArticulos(Model model, @AuthenticationPrincipal UserDetails userDetails) {
        Usuario usuario = usuarioService.obtenerUsuarioPorNombre(userDetails.getUsername()).orElseThrow();
        model.addAttribute("articulos", articuloService.obtenerArticulosPorUsuario(usuario));
        return "articulos";
    }

    @GetMapping("/nuevo")
    public String nuevoArticulo(Model model) {
        model.addAttribute("articulo", new Articulo());
        return "crearArticulo";
    }

    @PostMapping
    public String guardarArticulo(@ModelAttribute Articulo articulo, @AuthenticationPrincipal UserDetails userDetails) {
        Usuario usuario = usuarioService.obtenerUsuarioPorNombre(userDetails.getUsername()).orElseThrow();
        articulo.setUsuario(usuario);
        articuloService.guardarArticulo(articulo);
        return "redirect:/articulos";
    }

    @PostMapping("/eliminar/{id}")
    public String eliminarArticulo(@PathVariable Long id) {
        articuloService.eliminarArticulo(id);
        return "redirect:/articulos";
    }
}

