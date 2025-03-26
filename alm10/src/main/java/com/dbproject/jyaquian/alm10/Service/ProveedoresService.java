package com.dbproject.jyaquian.alm10.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbproject.jyaquian.alm10.Model.Entity.Proveedores;
import com.dbproject.jyaquian.alm10.Model.Repository.ProveedoresRepository;

@Service
public class ProveedoresService {

    @Autowired
    private ProveedoresRepository proveedoresRepository;

    public List<Proveedores> obtenerTodosLosProveedores() {
        return proveedoresRepository.findAll();
    }

    public Proveedores obtenerProveedorPorId(Long id) {
        return proveedoresRepository.findById(id).orElse(null);
    }

    public Proveedores crearProveedor(Proveedores proveedor) {
        return proveedoresRepository.save(proveedor);
    }

    public Proveedores actualizarProveedor(Long id, Proveedores detallesProveedor) {
        Optional<Proveedores> proveedorOptional = proveedoresRepository.findById(id);
        if (proveedorOptional.isPresent()) {
            Proveedores proveedor = proveedorOptional.get();
            proveedor.setNombre(detallesProveedor.getNombre());
            proveedor.setNit(detallesProveedor.getNit());
            proveedor.setTelefono(detallesProveedor.getTelefono());
            proveedor.setDireccion(detallesProveedor.getDireccion());
            return proveedoresRepository.save(proveedor);
        }
        return null;
    }

    public void eliminarProveedor(Long id) {
        proveedoresRepository.deleteById(id);
    }
}
