package com.portfolioRR.BackProyect.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
    
   private String nombreEmpresa;
   private String logoLaboral;
   private String tituloPuesto;
   private String periodo;
   private String descripcion;

    public Experiencia() {
    }

    public Experiencia(Long id, String nombreEmpresa, String logoLaboral, String tituloPuesto, String periodo, String descripcion) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.logoLaboral = logoLaboral;
        this.tituloPuesto = tituloPuesto;
        this.periodo = periodo;
        this.descripcion = descripcion;
    }
   
   public boolean equals(Experiencia exp){
        return this.getId() == exp.getId();
    }
}
