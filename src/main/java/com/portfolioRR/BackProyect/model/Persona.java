package com.portfolioRR.BackProyect.model;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {

@Id
@GeneratedValue(strategy = GenerationType.AUTO)     
private Long   id;

private String nombre;
private String apellido;
private int    edad;
private String fotoPerfil;
private String tituloDesarrollador;
private String about;
private String usuario;
private String password;
private String emailPrincipal;
private String emailAlternativo;
private String telefono;
private String direccion;

@OneToMany
    List<Educacion> listaEducacion;

@OneToMany
    List<Experiencia> listaExperiencia;

@OneToMany
    List<Proyecto> listaProyecto;

@OneToMany
    List<Redes> listaRedes;

@OneToMany
    List<Tecnologia> listaTecnologia;

@OneToMany
    List<Idioma> listaIdioma;

    public Persona() {
    }

    public Persona(Long id, String nombre, String apellido, int edad, String fotoPerfil, String tituloDesarrollador, String about, String usuario, String password, String emailPrincipal, String emailAlternativo, String telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fotoPerfil = fotoPerfil;
        this.tituloDesarrollador = tituloDesarrollador;
        this.about = about;
        this.usuario = usuario;
        this.password = password;
        this.emailPrincipal = emailPrincipal;
        this.emailAlternativo = emailAlternativo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    

    

        //añadiendo items a la lista
    public void addEducacion(Educacion edu){
        this.listaEducacion.add(edu);
    }
    
    public void addExperiencia(Experiencia exp){
        this.listaExperiencia.add(exp);
    }
    
    public void addProyecto(Proyecto pro){
        this.listaProyecto.add(pro);
    }
    
    public void addRedes(Redes red){
        this.listaRedes.add(red);
    }
    
    public void addTecnologia(Tecnologia tec){
        this.listaTecnologia.add(tec);
    }
    
    public void addIdioma(Idioma idi){
        this.listaIdioma.add(idi);
    }

    //removiendo items a los listados
    
    public void removerEducacion(Educacion edu){
        
        for(Educacion aux : this.listaEducacion ){
            if(aux.equals(edu)){
                this.listaEducacion.remove(edu);
                break;
            }
        }
    }
    
    public void removerExperiencia(Experiencia var){
        
        for(Experiencia aux : this.listaExperiencia ){
            if(aux.equals(var)){
                this.listaExperiencia.remove(var);
                break;
            }
        }
    }
     
    public void removerIdioma(Idioma var){
        
        for(Idioma aux : this.listaIdioma ){
            if(aux.equals(var)){
                this.listaIdioma.remove(var);
                break;
            }
        }
    }
      
    public void removerProyecto(Proyecto var){
        
        for(Proyecto aux : this.listaProyecto ){
            if(aux.equals(var)){
                this.listaProyecto.remove(var);
                break;
            }
        }
    }
    

    public void removerRedes(Redes var){
        
        for(Redes aux : this.listaRedes ){
            if(aux.equals(var)){
                this.listaRedes.remove(var);
                break;
            }
        }
    }
    
    public void removerTecnologia(Tecnologia var){
        
        for(Tecnologia aux : this.listaTecnologia ){
            if(aux.equals(var)){
                this.listaTecnologia.remove(var);
                break;
            }
        }
    }

    public boolean equals(String user){
    
       return (this.usuario == null ? user == null : this.usuario.equals(user));
    }
    
    public boolean igual(String clave){
    
       return (this.password == null ? password == null : this.password.equalsIgnoreCase(clave));
    }
}

