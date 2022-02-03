package com.example.demo.Repositorios;


import java.util.List;

import com.example.demo.Entidades.Grilla;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("repositoriogrilla")
public interface GrillaRepositorio extends JpaRepository<Grilla, Long>{
    
    
    public abstract List<Grilla> findAll();

    public abstract void deleteAll();

    //public abstract boolean saveOrUpdate(Usuario estudiante);
}
