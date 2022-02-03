package com.example.demo.Servicios;

import java.util.List;

import com.example.demo.Entidades.Usuario;
import com.example.demo.Repositorios.UsuarioRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("serviciousuario")
public class UsuarioServicio {
    @Autowired
    @Qualifier("repositoriousuario")
    private UsuarioRepositorio repositorio;

    public Usuario crear(Usuario user){
        repositorio.save(user);
        return user;   
    }

    public boolean eliminar(long id){
        try{
            repositorio.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public Usuario lastUser(){
        return repositorio.findTopByOrderByIdDesc();
    }

    /*
    public void eliminarAll(){
        List<Usuario> usuarios = repositorio.findAll();
        for (int i = 0; i < usuarios.size(); i++) {
            repositorio.deleteById(usuarios.get(i).getId());
        }
    }
    */

    public void eliminarAll(){
        repositorio.deleteAll();
    }

    public List<Usuario> obtenerAll(){
        return repositorio.findAll();
    }
}
