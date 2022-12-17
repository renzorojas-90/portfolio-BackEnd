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
    
    //Agregando items 
    public void agregarEducacion(Educacion edu,Persona per);
    public void agregarExperiencia(Experiencia exp,Persona per);
    public void agregarIdioma(Idioma idi,Persona per);
    public void agregarProyecto(Proyecto pro,Persona per);
    public void agregarRedes(Redes red,Persona per);
    public void agregarTecnologia(Tecnologia tec,Persona per);
    
    public void quitarEducacion(Educacion edu,Persona per);
    public void editarEducacion(Educacion ideducacion);
}
