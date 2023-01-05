/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolioRR.BackProyect.service;

import com.portfolioRR.BackProyect.model.Proyecto;
import com.portfolioRR.BackProyect.repository.ProyectoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService {

    @Autowired
    public ProyectoRepository proRepo;
    
    @Override
    public Proyecto crearProyecto(Proyecto pro) {
        return proRepo.save(pro);
    }

    @Override
    public void eliminarProyecto(Proyecto pro) {
        proRepo.delete(pro);
    }

    @Override
    public void editarProyecto(Proyecto pro) {
        proRepo.save(pro);
    }

    @Override
    public Proyecto VerProyecto(long id) {
       return proRepo.findById(id).orElse(null);
    }
    
}
