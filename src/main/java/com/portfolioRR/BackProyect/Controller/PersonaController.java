/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolioRR.BackProyect.Controller;

import com.portfolioRR.BackProyect.model.Persona;
import com.portfolioRR.BackProyect.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
   
    //se inyecta la dependencia es decir la interface del servicio 
    @Autowired
    private IPersonaService perso;
    
    @PostMapping("/new/persona")
    public void agregarPersona(@RequestBody Persona per){
        perso.crearPersona(per);
    }
    
    @GetMapping("/ver/persona/{id}")
    @ResponseBody
    public Persona verPersona(@PathVariable Long id){
        return perso.verPersona(id);
    }
    
    @PutMapping("/editar/persona")
    public void editarPersona(@RequestBody Persona per){
        perso.editarPersona(per);
    }
    
}
