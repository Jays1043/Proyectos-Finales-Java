package com.dbproject.jyaquian.alm10.Model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbproject.jyaquian.alm10.Model.Entity.Proveedores;

@Repository
public interface ProveedoresRepository extends JpaRepository<Proveedores, Long>{

}
