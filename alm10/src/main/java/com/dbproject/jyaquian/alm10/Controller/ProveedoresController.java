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

import com.dbproject.jyaquian.alm10.Model.Entity.Proveedores;
import com.dbproject.jyaquian.alm10.Model.Repository.ProveedoresRepository;

@RestController
@RequestMapping("/proveedores")
@CrossOrigin(origins = {"http://localhost:5000", "https://localhost:9090"})
public class ProveedoresController {

    @Autowired
    private ProveedoresRepository proveedoresRepository;

    @GetMapping("/list_proveedores")
    public List<Proveedores> obtenerTodosLosProveedores() {
        return proveedoresRepository.findAll();
    }

    @GetMapping("/findById")
    public Proveedores obtenerProveedorPorId(@RequestParam Long id) {
        return proveedoresRepository.findById(id).orElse(null);
    }

    @PostMapping("/create")
    public Proveedores crearProveedor(@RequestBody Proveedores proveedor) {
        return proveedoresRepository.save(proveedor);
    }

    @PutMapping("/update")
    public Proveedores actualizarProveedor(@RequestParam Long id, @RequestBody Proveedores detallesProveedor) {
        Proveedores proveedor = proveedoresRepository.findById(id).orElse(null);
        if (proveedor != null) {
            proveedor.setNombre(detallesProveedor.getNombre());
            proveedor.setNit(detallesProveedor.getNit());
            proveedor.setTelefono(detallesProveedor.getTelefono());
            proveedor.setDireccion(detallesProveedor.getDireccion());
            return proveedoresRepository.save(proveedor);
        }
        return null;
    }

    @DeleteMapping("/delete")
    public void eliminarProveedor(@RequestParam Long id) {
        proveedoresRepository.deleteById(id);
    }
}


