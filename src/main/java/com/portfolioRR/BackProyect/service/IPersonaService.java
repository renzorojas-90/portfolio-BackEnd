/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolioRR.BackProyect.service;

import com.portfolioRR.BackProyect.model.Persona;


public interface IPersonaService {
    
    public void crearPersona(Persona per);
    public Persona verPersona(Long id);
    public void editarPersona(Persona per);
}
