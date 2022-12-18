package com.portfolioRR.BackProyect.service;

import com.portfolioRR.BackProyect.model.Idioma;
import com.portfolioRR.BackProyect.repository.IdiomaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdiomaService implements IIdiomaService {

    @Autowired
    public IdiomaRepository idiRepo;
    
    @Override
    public Idioma crearIdioma(Idioma idi) {
      return  idiRepo.save(idi);
    }
    
    @Override
    public void eliminarIdioma(Idioma idi){
        idiRepo.delete(idi);
    }

    @Override
    public void editarIdioma(Idioma idi) {
        idiRepo.save(idi);
    }
    
    
}
