package com.umg.proyecto_bdii.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Optional;


import com.umg.proyecto_bdii.Entity.Usuario;
import com.umg.proyecto_bdii.Repository.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public boolean validarUsuario(String username, String password) {
        Optional<Usuario> usuario = usuarioRepository.findByUsername(username);
        return usuario.isPresent() && passwordEncoder.matches(password, usuario.get().getPassword());
    }
}
