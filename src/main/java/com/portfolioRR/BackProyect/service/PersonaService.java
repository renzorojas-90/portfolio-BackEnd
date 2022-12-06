
package com.portfolioRR.BackProyect.service;

import com.portfolioRR.BackProyect.model.Persona;
import com.portfolioRR.BackProyect.repository.PersonaRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService {

    //inyectamos la dependencia
    @Autowired
    public PersonaRepository perso;
    
    @Override
    public void crearPersona(Persona per) {
        perso.save(per);
    }

    @Override
    public Persona verPersona(Long id) {
       return perso.findById(id).orElse(null);
        
    }

    @Override
    public void editarPersona(Persona per) {
        perso.save(per);
    }
    
}
