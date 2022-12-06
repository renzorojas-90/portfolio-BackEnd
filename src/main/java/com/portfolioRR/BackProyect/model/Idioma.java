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
    
    Long id;
    String nombre;
    String nivelEscritura;
    String nivelHabla;
    String nativo;
}
