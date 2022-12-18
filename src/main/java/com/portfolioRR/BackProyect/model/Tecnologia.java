package com.portfolioRR.BackProyect.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Tecnologia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String nombreTecno;
    private String logoTecno;
    private String gradoDominio;

    public Tecnologia() {
    }

    public Tecnologia(Long id, String nombreTecno, String logoTecno, String gradoDominio) {
        this.id = id;
        this.nombreTecno = nombreTecno;
        this.logoTecno = logoTecno;
        this.gradoDominio = gradoDominio;
    }
    
    
    public boolean equals(Tecnologia tec){
        return this.getId() == tec.getId();
    }
    
}
