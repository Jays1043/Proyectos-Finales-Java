package com.dbproject.jyaquian.alm10.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dbproject.jyaquian.alm10.Model.Entity.Clientes;
import com.dbproject.jyaquian.alm10.Model.Repository.ClientesRepository;

@RestController
@RequestMapping("/clientes")
@CrossOrigin(origins = {"http://localhost:5000", "https://localhost:9090"})
public class ClientesController {

    @Autowired
    private ClientesRepository clientesRepository;

    @GetMapping("/list_clientes")
    public List<Clientes> obtenerTodosLosClientes() {
        return clientesRepository.findAll();
    }

    @GetMapping("/findById")
    public Clientes obtenerClientePorId(@RequestParam Long id) {
        return clientesRepository.findById(id).orElse(null);
    }

    @PostMapping("/create")
    public Clientes crearCliente(@RequestBody Clientes cliente) {
        return clientesRepository.save(cliente);
    }

    @PutMapping("/update")
    public Clientes actualizarCliente(@RequestParam Long id, @RequestBody Clientes detallesCliente) {
        Clientes cliente = clientesRepository.findById(id).orElse(null);
        if (cliente != null) {
            cliente.setNombre(detallesCliente.getNombre());
            cliente.setApellido(detallesCliente.getApellido());
            cliente.setNit(detallesCliente.getNit());
            cliente.setTelefono(detallesCliente.getTelefono());
            cliente.setDireccion(detallesCliente.getDireccion());
            return clientesRepository.save(cliente);
        }
        return null;
    }

    @DeleteMapping("/delete")
    public void eliminarCliente(@RequestParam Long id) {
        clientesRepository.deleteById(id);
    }
}
