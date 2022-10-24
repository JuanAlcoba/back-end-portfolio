
package com.portfolio.prueba.Controller;

import com.portfolio.prueba.Entity.Experiencia;
import com.portfolio.prueba.Interface.IExperienciaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/experiencia")
@CrossOrigin (origins = "http://localhost:4200")
public class ExperienciaController {
    @Autowired IExperienciaService iexperienciaService;
    
    @GetMapping("/traer")
    public List<Experiencia> getExperiencia(){
    return iexperienciaService.getExperiencia();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear")
    public void createExperiencia(@RequestBody Experiencia edu){
        iexperienciaService.saveExperiencia(edu);
       // return "El elemento fue creado correctamente";
        
    }
    
    /*@PostMapping
    public Persona agregar(@RequestBody Persona p){
        return service.add(p);
    } */
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/eliminar/{id}")
    public void deleteExperiencia(@PathVariable Long id){
        iexperienciaService.deleteExperiencia(id);
        // return "El elemento fue eliminado correctamente";
        
    }
    
    /* @DeleteMapping(path = {"/{id}"})
        public Experiencia borrarExperiencia(@PathVariable ("id") Long id){
            return iexperienciaService.borrarExperiencia(id);
        }
    */
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public Experiencia editarExperiencia(@PathVariable("id") Long id,
            @RequestBody Experiencia experiencia) {
        experiencia.setId(id);
        iexperienciaService.saveExperiencia(experiencia);
        return experiencia;
    }
    
    @GetMapping(path = {"/{id}"})
    public Experiencia listarId(@PathVariable ("id") Long id){
    return iexperienciaService.findExperiencia(id);
    }
}
