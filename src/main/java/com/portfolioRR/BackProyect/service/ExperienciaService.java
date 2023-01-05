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

    @Override
    public void eliminarExperiencia(Experiencia exp) {
      expRepo.delete(exp);
    }

    @Override
    public void editarExperiencia(Experiencia exp) {
        expRepo.save(exp);
    }

    @Override
    public Experiencia verExperiencia(Long id) {
        return expRepo.findById(id).orElse(null);
    }
    
    
}
