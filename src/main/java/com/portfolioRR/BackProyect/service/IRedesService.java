package com.portfolioRR.BackProyect.service;

import com.portfolioRR.BackProyect.model.Redes;

public interface IRedesService {
    
    public Redes crearRedes(Redes red);
    public void eliminarRedes(Redes red);
    public void editarRedes(Redes red);
    public Redes verRedes (long id);
}
