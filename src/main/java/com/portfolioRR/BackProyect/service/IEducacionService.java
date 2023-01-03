package com.portfolioRR.BackProyect.service;

import com.portfolioRR.BackProyect.model.Educacion;
import java.util.List;

public interface IEducacionService {
    
    public Educacion crearEducacion(Educacion edu);
    public List <Educacion> verEducacion();
    public void eliminarEducacion(Educacion edu);
    public void editarEducacion(Educacion edu);
    public Educacion verUnaEducacion(long id);
}
