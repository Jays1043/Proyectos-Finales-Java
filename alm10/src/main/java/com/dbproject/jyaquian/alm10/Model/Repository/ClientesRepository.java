package com.dbproject.jyaquian.alm10.Model.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbproject.jyaquian.alm10.Model.Entity.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long>{

}
