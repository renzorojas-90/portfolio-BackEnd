package com.portfolioRR.BackProyect.service;

import com.portfolioRR.BackProyect.model.Redes;
import com.portfolioRR.BackProyect.repository.RedesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedesService implements IRedesService {

    @Autowired
    public RedesRepository redRepo;
    
    @Override
    public Redes crearRedes(Redes red) {
       return redRepo.save(red);
    }

    @Override
    public void eliminarRedes(Redes red) {
        redRepo.delete(red);
    }

    @Override
    public void editarRedes(Redes red) {
        redRepo.save(red);
    }

    @Override
    public Redes verRedes(long id) {
       return redRepo.findById(id).orElse(null);
    }
    
}
