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

String nombreCarrera;
String institucionNombre;
String logoInstituto;
String periodo;
String tituloEducacion;
String certificado;

}
