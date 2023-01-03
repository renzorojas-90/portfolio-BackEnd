/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.portfolioRR.BackProyect.Controller;

import com.portfolioRR.BackProyect.model.Educacion;
import com.portfolioRR.BackProyect.service.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EducacionController {
    
    @Autowired
    public IEducacionService eduServ;
    
    @GetMapping("ver/educacion/{id}")
    @ResponseBody
    public Educacion verUnaEducacion(@PathVariable Long id){
        return eduServ.verUnaEducacion(id);
    }
    
    @GetMapping("ver/educacion")
    @ResponseBody
    public List <Educacion> verEducacion(){
        return eduServ.verEducacion();
    }
    
    
    
}
