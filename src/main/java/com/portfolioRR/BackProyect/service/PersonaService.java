
package com.portfolioRR.BackProyect.service;

import com.portfolioRR.BackProyect.model.Educacion;
import com.portfolioRR.BackProyect.model.Experiencia;
import com.portfolioRR.BackProyect.model.Idioma;
import com.portfolioRR.BackProyect.model.Persona;
import com.portfolioRR.BackProyect.model.Proyecto;
import com.portfolioRR.BackProyect.model.Redes;
import com.portfolioRR.BackProyect.model.Tecnologia;
import com.portfolioRR.BackProyect.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    //inyectamos las dependencia
    @Autowired
    public PersonaRepository persoRepo;
    
    @Autowired 
    public EducacionService eduServ;
    
    @Autowired 
    public ExperienciaService expServ;
    
    @Autowired 
    public ProyectoService proServ;
    
    @Autowired 
    public IdiomaService idiServ;
    
    @Autowired 
    public RedesService redServ;
    
    @Autowired 
    public TecnologiaService tecServ;
    
    //servicios  de persona
    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public Persona verPersona(Long id) {
       return persoRepo.findById(id).orElse(null);
        
    }

    @Override
    public void editarPersona(Persona per) {
        persoRepo.save(per);
    }

    @Override
    public void agregarEducacion(Educacion edu, Persona per) {
        Educacion edu_id = eduServ.crearEducacion(edu);
        per.addEducacion(edu_id);
        persoRepo.save(per);
    }

    @Override
    public void agregarExperiencia(Experiencia exp, Persona per) {
        Experiencia exp_id = expServ.crearExperiencia(exp);
        per.addExperiencia(exp_id);
        persoRepo.save(per);  
    }

    @Override
    public void agregarIdioma(Idioma idi, Persona per) {
        Idioma idi_id = idiServ.crearIdioma(idi);
        per.addIdioma(idi_id);
        persoRepo.save(per);
    }

    @Override
    public void agregarProyecto(Proyecto pro, Persona per) {
        Proyecto pro_id = proServ.crearProyecto(pro);
        per.addProyecto(pro_id);
        persoRepo.save(per);
    }

    @Override
    public void agregarRedes(Redes red, Persona per) {
        Redes red_id = redServ.crearRedes(red);
        per.addRedes(red_id);
        persoRepo.save(per);
    }

    @Override
    public void agregarTecnologia(Tecnologia tec, Persona per) {
        Tecnologia tec_id = tecServ.crearTecnologia(tec);
        per.addTecnologia(tec_id);
        persoRepo.save(per);
    }

    @Override
    public void quitarEducacion(Educacion edu,Persona per) {
        
        System.out.println("aqui estoy trayendo algo");
         System.out.println("teyendo per: " + per.getListaEducacion().size());
         System.out.println("teyendo edu: " + edu);
        per.removerEducacion(edu);
        persoRepo.save(per);
        eduServ.eliminarEducacion(edu);
        
        System.out.println("teyendo per: " + per.getListaEducacion().size());
    }

    
    
}
