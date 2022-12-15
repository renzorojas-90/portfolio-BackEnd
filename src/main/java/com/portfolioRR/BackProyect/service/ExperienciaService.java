package com.portfolioRR.BackProyect.service;

import com.portfolioRR.BackProyect.model.Experiencia;
import com.portfolioRR.BackProyect.repository.ExperienciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService {

    @Autowired
    public ExperienciaRepository expRepo;
    
    @Override
    public Experiencia crearExperiencia(Experiencia exp) {
        return expRepo.save(exp);
    }
    
    
}
