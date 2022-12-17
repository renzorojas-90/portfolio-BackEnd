package com.portfolioRR.BackProyect.Controller;

import com.portfolioRR.BackProyect.model.Educacion;
import com.portfolioRR.BackProyect.model.Experiencia;
import com.portfolioRR.BackProyect.model.Idioma;
import com.portfolioRR.BackProyect.model.Persona;
import com.portfolioRR.BackProyect.model.Proyecto;
import com.portfolioRR.BackProyect.model.Redes;
import com.portfolioRR.BackProyect.model.Tecnologia;
import com.portfolioRR.BackProyect.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
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
    
    //Agregando a persona los diferentes items
    
     @PostMapping("/new/educacion/{id}")
     public void crearEducacion(@RequestBody Educacion aux,@PathVariable Persona id){
        perso.agregarEducacion(aux, id);
    }
     
     @PostMapping("/new/experiencia/{id}")
     public void crearExperiencia(@RequestBody Experiencia aux,@PathVariable Persona id){
        perso.agregarExperiencia(aux, id);
    }
     
     @PostMapping("/new/idioma/{id}")
     public void crearIdioma(@RequestBody Idioma aux,@PathVariable Persona id){
        perso.agregarIdioma(aux, id);
    } 
     
     @PostMapping("/new/proyecto/{id}")
     public void crearProyecto(@RequestBody Proyecto aux,@PathVariable Persona id){
        perso.agregarProyecto(aux, id);
    }
    
     @PostMapping("/new/redes/{id}")
     public void crearRedes(@RequestBody Redes aux,@PathVariable Persona id){
        perso.agregarRedes(aux, id);
    }
     
     @PostMapping("/new/tecnologia/{id}")
     public void crearTecnologia(@RequestBody Tecnologia aux,@PathVariable Persona id){
        perso.agregarTecnologia(aux, id);
    }
     
     
     @DeleteMapping("/eliminar/educacion/{idpersona}/{ideducacion}")
     public void quitarEducacion(@PathVariable Educacion ideducacion,@PathVariable Persona idpersona){
        perso.quitarEducacion(ideducacion,idpersona);
    }
     
     @PutMapping("/editar/educacion")
       public void editarEducacion(@RequestBody Educacion edu){
        perso.editarEducacion(edu);
    }
     

}
