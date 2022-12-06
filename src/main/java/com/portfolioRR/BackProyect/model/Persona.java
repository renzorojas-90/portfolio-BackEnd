/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolioRR.BackProyect.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
Long id;
String nombre;
String apellido;
int edad;
String fotoPerfil;
String tituloDesarrollador;
String usuario;
String password;
    
}
