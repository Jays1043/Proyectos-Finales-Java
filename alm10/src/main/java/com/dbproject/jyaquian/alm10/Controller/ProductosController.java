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

import com.dbproject.jyaquian.alm10.Model.Entity.Productos;
import com.dbproject.jyaquian.alm10.Model.Repository.ProductosRepository;

@RestController
@RequestMapping("/productos")
@CrossOrigin(origins = {"http://localhost:5000", "https://localhost:9090"})
public class ProductosController {

    @Autowired
    private ProductosRepository productosRepository;

    @GetMapping("/list_productos")
    public List<Productos> obtenerTodosLosProductos() {
        return productosRepository.findAll();
    }

    @GetMapping("/findById")
    public Productos obtenerProductoPorId(@RequestParam Long id) {
        return productosRepository.findById(id).orElse(null);
    }

    @PostMapping("/create")
    public Productos crearProducto(@RequestBody Productos producto) {
        return productosRepository.save(producto);
    }

    @PutMapping("/update")
    public Productos actualizarProducto(@RequestParam Long id, @RequestBody Productos detallesProducto) {
        Productos producto = productosRepository.findById(id).orElse(null);
        if (producto != null) {
            producto.setNombre(detallesProducto.getNombre());
            producto.setDescripcion(detallesProducto.getDescripcion());
            producto.setPrecio(detallesProducto.getPrecio());
            producto.setExistencias(detallesProducto.getExistencias());
            return productosRepository.save(producto);
        }
        return null;
    }

    @DeleteMapping("/delete")
    public void eliminarProducto(@RequestParam Long id) {
        productosRepository.deleteById(id);
    }
}

