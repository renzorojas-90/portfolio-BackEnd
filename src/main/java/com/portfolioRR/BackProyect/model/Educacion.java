package com.portfolioRR.BackProyect.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Educacion {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
Long id;

private String nombreCarrera;
private String institucionNombre;
private String logoInstituto;
private String periodo;
private String tituloEducacion;
private String certificado;

    public Educacion() {
    } 

    public Educacion(Long id, String nombreCarrera, String institucionNombre, String logoInstituto, String periodo, String tituloEducacion, String certificado) {
        this.id = id;
        this.nombreCarrera = nombreCarrera;
        this.institucionNombre = institucionNombre;
        this.logoInstituto = logoInstituto;
        this.periodo = periodo;
        this.tituloEducacion = tituloEducacion;
        this.certificado = certificado;
    }



}
