package com.example.demo.Servicios;

import java.util.List;

import com.example.demo.Entidades.Grilla;
import com.example.demo.Repositorios.GrillaRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("serviciogrilla")
public class GrillaServicio {
    @Autowired
    @Qualifier("repositoriogrilla")
    private GrillaRepositorio repositorio;

    public long crear(Grilla user){
        try{
            repositorio.save(user);
            return user.getId();
        } catch (Exception e) {
            return -1;
        }
    }


    public void eliminarAll(){
        repositorio.deleteAll();
    }

    public List<Grilla> obtenerAll(){
        return repositorio.findAll();
    }
}
