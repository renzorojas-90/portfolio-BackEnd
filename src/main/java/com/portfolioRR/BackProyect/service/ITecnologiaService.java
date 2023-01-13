package com.portfolioRR.BackProyect.service;

import com.portfolioRR.BackProyect.model.Tecnologia;


public interface ITecnologiaService {
    
    public Tecnologia crearTecnologia(Tecnologia tec);
    public void eliminarTecnologia(Tecnologia tec);
    public void editarTecnologia(Tecnologia tec);
    public Tecnologia verTecnologia(Long id);
}
