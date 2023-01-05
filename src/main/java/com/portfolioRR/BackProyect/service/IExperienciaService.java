package com.portfolioRR.BackProyect.service;

import com.portfolioRR.BackProyect.model.Experiencia;

public interface IExperienciaService {
    
    public Experiencia crearExperiencia(Experiencia exp);
    public void eliminarExperiencia(Experiencia exp);
    public void editarExperiencia(Experiencia exp);
    public Experiencia verExperiencia(Long id);
}
