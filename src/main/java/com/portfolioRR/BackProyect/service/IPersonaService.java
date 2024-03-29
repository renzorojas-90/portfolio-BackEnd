package com.portfolioRR.BackProyect.service;

import com.portfolioRR.BackProyect.model.Educacion;
import com.portfolioRR.BackProyect.model.Experiencia;
import com.portfolioRR.BackProyect.model.Idioma;
import com.portfolioRR.BackProyect.model.Persona;
import com.portfolioRR.BackProyect.model.Proyecto;
import com.portfolioRR.BackProyect.model.Redes;
import com.portfolioRR.BackProyect.model.Tecnologia;


public interface IPersonaService {
    
    public void crearPersona(Persona per);
    public Persona verPersona(Long id);
    public void editarPersona(Persona per);
    
    //Login
    public Persona loguearse(String usuario, String password);
     public boolean loguearse2(String usuario, String password);
    
    //educacion
    public void agregarEducacion(Educacion edu,Persona per);
    public void quitarEducacion(Educacion edu,Persona per);
    public void editarEducacion(Educacion ideducacion);
    
    //Experiencia
    public void agregarExperiencia(Experiencia exp,Persona per);
    public void quitarExperiencia(Persona per,Experiencia exp);
    public void editarExperiencia(Experiencia exp);
    
    //Idioma
    public void agregarIdioma(Idioma idi,Persona per);
    public void quitarIdioma(Persona per,Idioma var);
    public void editarIdioma(Idioma var);
    
    //proyecto
    public void agregarProyecto(Proyecto pro,Persona per);
    public void quitarProyecto(Persona per,Proyecto var);
    public void editarProyecto(Proyecto var);
    
    //Redes
    public void agregarRedes(Redes red,Persona per);
    public void quitarRedes(Persona per,Redes var);
    public void editarRedes(Redes var);
    
    //Tecnologia
    public void agregarTecnologia(Tecnologia tec,Persona per);
    public void quitarTecnologia(Persona per,Tecnologia var);
    public void editarTecnologia(Tecnologia var);
    
    
}
