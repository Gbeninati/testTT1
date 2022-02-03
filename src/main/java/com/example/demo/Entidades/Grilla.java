package com.example.demo.Entidades;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="grilla")
public class Grilla {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    long id;

    @Column(name="id_usuario")
    long id_usuario;

    @Column(name="grilla", length = 1000)
    String grilla;

    @Column(name="movimientos", length = 10000)
    String movimientos;


    public Grilla(){

    }

    public Grilla(long id, long id_usuario, String grilla, String movimientos){
        this.id = id;
        this.id_usuario = id_usuario;
        this.grilla = grilla;
        this.movimientos = movimientos;
    }

    public long getId(){
        return this.id;
    }

    public void SetId(long id){
        this.id = id;
    }

    public String getGrilla(){
        return this.grilla;
    }

    public void SetGrilla(String grilla){
        this.grilla = grilla;
    }

    public long getIdUsuario(){
        return this.id_usuario;
    }

    public void SetIdUsuario(long id){
        this.id_usuario = id;
    }

    public String getMovimientos(){
        return this.movimientos;
    }

    public void SetMovimientos(String movimientos){
        this.movimientos = movimientos;
    }


}


