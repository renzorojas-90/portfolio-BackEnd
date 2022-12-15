package com.portfolioRR.BackProyect.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombre;
    private String fechaRealizado;
    private String descripcion;
    private String linkEvidencia;

    public Proyecto() {
    }

    public Proyecto(Long id, String nombre, String fechaRealizado, String descripcion, String linkEvidencia) {
        this.id = id;
        this.nombre = nombre;
        this.fechaRealizado = fechaRealizado;
        this.descripcion = descripcion;
        this.linkEvidencia = linkEvidencia;
    }
    
    
    
}
