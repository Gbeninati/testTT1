package com.example.demo.Controladores;

import java.util.List;


import com.example.demo.Entidades.Grilla;
import com.example.demo.Servicios.GrillaServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMethod;


@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
@RequestMapping("/grilla")
public class GrillaController {
    @Autowired
    @Qualifier("serviciogrilla")
    GrillaServicio servicio;

    @GetMapping("/getAll")
    public List<Grilla> getAllUsuario(){
        return servicio.obtenerAll();
    }

    @PostMapping("/crear")
    public long agregarUsuario(@RequestBody Grilla user){
        return servicio.crear(user);
    }

    @DeleteMapping("/eliminar/deleteAll")
    public void borrarTodosUsuarios(){
        servicio.eliminarAll();
    }

    
}
