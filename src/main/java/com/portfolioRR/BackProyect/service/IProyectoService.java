/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolioRR.BackProyect.service;

import com.portfolioRR.BackProyect.model.Proyecto;

/**
 *
 * @author Renzo
 */
public interface IProyectoService {
    
    public Proyecto crearProyecto(Proyecto pro);
    public void eliminarProyecto(Proyecto pro);
    public void editarProyecto(Proyecto pro);
    public Proyecto VerProyecto(long id);
}
