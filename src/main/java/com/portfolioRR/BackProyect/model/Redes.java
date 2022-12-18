package com.portfolioRR.BackProyect.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Redes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String link;
    private String logo;

    public Redes() {
    }

    public Redes(Long id, String link, String logo) {
        this.id = id;
        this.link = link;
        this.logo = logo;
    }
    
    public boolean equals(Redes red){
        return this.getId() == red.getId();
    }
}
