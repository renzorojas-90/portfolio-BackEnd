package com.portfolioRR.BackProyect.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Idioma {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)    
    private Long id;
    
    private String nombre;
    private String nivelEscritura;
    private String nivelHabla;
    private String nativo;

    public Idioma() {
    }

    public Idioma(Long id, String nombre, String nivelEscritura, String nivelHabla, String nativo) {
        this.id = id;
        this.nombre = nombre;
        this.nivelEscritura = nivelEscritura;
        this.nivelHabla = nivelHabla;
        this.nativo = nativo;
    }
    
    public boolean equals(Idioma idi){
        return this.getId() == idi.getId();
    }
    
}
