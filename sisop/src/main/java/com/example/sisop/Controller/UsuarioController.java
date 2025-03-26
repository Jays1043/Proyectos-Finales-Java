package com.example.sisop.Controller;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.sisop.Entity.Usuario;
import com.example.sisop.Service.UsuarioService;



@Controller
public class UsuarioController {

   
    private UsuarioService usuarioService;
    private final PasswordEncoder passwordEncoder;
    
    public UsuarioController(UsuarioService usuarioService, PasswordEncoder passwordEncoder) {
        this.usuarioService = usuarioService;
        this.passwordEncoder = passwordEncoder;
    }
    
    @PostMapping("/registro")
    public String registrarUsuario(@ModelAttribute Usuario usuario) {
        usuarioService.guardarUsuario(usuario, passwordEncoder);
        return "redirect:/login"; 
    }

    @GetMapping("/registro")
    public String mostrarFormularioRegistro(Model model) {
        model.addAttribute("usuario", new Usuario());
        return "registro";
    }

    @GetMapping("/login")
    public String mostrarFormularioLogin() {
        return "login";
    }
    
    
    @GetMapping("/home")
    public String mostrarPaginaInicio() {
        return "home"; 
    }
}
