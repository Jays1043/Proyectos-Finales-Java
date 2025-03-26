package com.dbproject.jyaquian.alm10.Service;

import com.dbproject.jyaquian.alm10.Model.Entity.Productos;
import com.dbproject.jyaquian.alm10.Model.Repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductosService {

    @Autowired
    private ProductosRepository productosRepository;

    public List<Productos> obtenerTodosLosProductos() {
        return productosRepository.findAll();
    }

    public Productos obtenerProductoPorId(Long id) {
        Optional<Productos> productoOptional = productosRepository.findById(id);
        return productoOptional.orElse(null);
    }

    public Productos crearProducto(Productos producto) {
        return productosRepository.save(producto);
    }

    public Productos actualizarProducto(Long id, Productos detallesProducto) {
        Optional<Productos> productoOptional = productosRepository.findById(id);
        if (productoOptional.isPresent()) {
            Productos producto = productoOptional.get();
            producto.setNombre(detallesProducto.getNombre());
            producto.setDescripcion(detallesProducto.getDescripcion());
            producto.setPrecio(detallesProducto.getPrecio());
            producto.setExistencias(detallesProducto.getExistencias());
            return productosRepository.save(producto);
        }
        return null;
    }

    public void eliminarProducto(Long id) {
        productosRepository.deleteById(id);
    }
}

