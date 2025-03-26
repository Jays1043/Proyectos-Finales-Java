package com.dbproject.jyaquian.alm10.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbproject.jyaquian.alm10.Model.Entity.Clientes;
import com.dbproject.jyaquian.alm10.Model.Repository.ClientesRepository;

@Service
public class ClientesService {

    @Autowired
    private ClientesRepository clientesRepository;

    public List<Clientes> obtenerTodosLosClientes() {
        return clientesRepository.findAll();
    }

    public Clientes obtenerClientePorId(Long id) {
        return clientesRepository.findById(id).orElse(null);
    }

    public Clientes crearCliente(Clientes cliente) {
        return clientesRepository.save(cliente);
    }

    public Clientes actualizarCliente(Long id, Clientes detallesCliente) {
        Optional<Clientes> clienteOptional = clientesRepository.findById(id);
        if (clienteOptional.isPresent()) {
            Clientes cliente = clienteOptional.get();
            cliente.setNombre(detallesCliente.getNombre());
            cliente.setApellido(detallesCliente.getApellido());
            cliente.setNit(detallesCliente.getNit());
            cliente.setTelefono(detallesCliente.getTelefono());
            cliente.setDireccion(detallesCliente.getDireccion());
            return clientesRepository.save(cliente);
        }
        return null;
    }

    public void eliminarCliente(Long id) {
        clientesRepository.deleteById(id);
    }
}
