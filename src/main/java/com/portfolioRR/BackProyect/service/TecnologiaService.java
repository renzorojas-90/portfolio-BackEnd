package com.portfolioRR.BackProyect.service;

import com.portfolioRR.BackProyect.model.Tecnologia;
import com.portfolioRR.BackProyect.repository.TecnologiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnologiaService implements ITecnologiaService {
    
    @Autowired 
    public TecnologiaRepository tecRepo;
    
    @Override
    public Tecnologia crearTecnologia(Tecnologia tec) {
        return tecRepo.save(tec);
    }

    @Override
    public void eliminarTecnologia(Tecnologia tec) {
        tecRepo.delete(tec);
    }

    @Override
    public void editarTecnologia(Tecnologia tec) {
        tecRepo.save(tec);
    }
    
}
