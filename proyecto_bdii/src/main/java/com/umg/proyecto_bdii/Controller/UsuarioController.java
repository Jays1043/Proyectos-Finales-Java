package com.umg.proyecto_bdii.Controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.umg.proyecto_bdii.Service.UsuarioService;

public class UsuarioController {
        @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> loginData) {
        String username = loginData.get("username");
        String password = loginData.get("password");

        if (usuarioService.validarUsuario(username, password)) {
            return "Login exitoso";
        } else {
            return "Credenciales incorrectas";
        }
    }
}
