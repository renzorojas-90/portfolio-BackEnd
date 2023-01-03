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
    
    //LOGIN
    @GetMapping("/login/{usuario}/{password}")
    @ResponseBody
    public Persona loguearse(@PathVariable String usuario,@PathVariable String password){
       return perso.loguearse(usuario,password);
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
     
     //educacion
     
     @DeleteMapping("/eliminar/educacion/{ideducacion}/{idpersona}")
     public void quitarEducacion(@PathVariable Educacion ideducacion,@PathVariable Persona idpersona){
        perso.quitarEducacion(ideducacion,idpersona);
    }
     
    @PutMapping("/editar/educacion")
    public void editarEducacion(@RequestBody Educacion edu){
        
        System.out.println("llega aqui:" + edu);
        System.out.println(":"+edu.getNombreCarrera());
        System.out.println(":"+edu.getId());
        perso.editarEducacion(edu);
    }
     
       //Experiencia
       
    @DeleteMapping("/eliminar/experiencia/{idpersona}/{idexp}")
    public void quitarExperiencia(@PathVariable Persona idpersona,@PathVariable Experiencia idexp){
        perso.quitarExperiencia(idpersona,idexp);
    }
     
    @PutMapping("/editar/experiencia")
    public void editarExperiencia(@RequestBody Experiencia exp){
        perso.editarExperiencia(exp);
    }
       
       //Idioma
       
    @DeleteMapping("/eliminar/idioma/{idpersona}/{id}")
         public void quitarIdioma(@PathVariable Persona idpersona,@PathVariable Idioma id){
        perso.quitarIdioma(idpersona,id);
    }
     
     @PutMapping("/editar/idioma")
       public void editarIdioma(@RequestBody Idioma var){
        perso.editarIdioma(var);
    }
     
       //Proyecto
       
    @DeleteMapping("/eliminar/proyecto/{idpersona}/{id}")
     public void quitarProyecto(@PathVariable Persona idpersona,@PathVariable Proyecto id){
        perso.quitarProyecto(idpersona,id);
    }
     
    @PutMapping("/editar/proyecto")
       public void editarProyecto(@RequestBody Proyecto var){
        perso.editarProyecto(var);
    }
       
       //redes
    @DeleteMapping("/eliminar/redes/{idpersona}/{id}")
    public void quitarRedes(@PathVariable Persona idpersona,@PathVariable Redes id){
        perso.quitarRedes(idpersona,id);
    }
     
    @PutMapping("/editar/redes")
    public void editarRedes(@RequestBody Redes var){
        perso.editarRedes(var);
    }
    
    //Tecnologia
    
    @DeleteMapping("/eliminar/tecnologia/{idpersona}/{id}")
    public void quitarTecnologia(@PathVariable Persona idpersona,@PathVariable Tecnologia id){
        perso.quitarTecnologia(idpersona,id);
    }
     
    @PutMapping("/editar/tecnologia")
    public void editarTecnologia(@RequestBody Tecnologia var){
        perso.editarTecnologia(var);
    }

}
