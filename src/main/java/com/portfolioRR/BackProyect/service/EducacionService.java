/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolioRR.BackProyect.service;

import com.portfolioRR.BackProyect.model.Educacion;
import com.portfolioRR.BackProyect.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EducacionService implements IEducacionService{
    
    @Autowired 
    public EducacionRepository EduRepo;
    
    @Override
    public Educacion crearEducacion(Educacion edu) {
       return EduRepo.save(edu);
    }

    @Override
    public List<Educacion> verEducacion() {
        return EduRepo.findAll();
    }

    @Override
    public void eliminarEducacion(Educacion edu) {
         EduRepo.delete(edu);
    }

    @Override
    public void editarEducacion(Educacion edu) {
        EduRepo.save(edu);
    }
}
