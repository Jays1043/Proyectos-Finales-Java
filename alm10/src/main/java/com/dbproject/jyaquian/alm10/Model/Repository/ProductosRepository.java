package com.dbproject.jyaquian.alm10.Model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbproject.jyaquian.alm10.Model.Entity.Productos;

@Repository
public interface ProductosRepository extends JpaRepository<Productos, Long>{

}
