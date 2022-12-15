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
    
}
