
package com.portfolio.prueba.Controller;

import com.portfolio.prueba.Entity.Educacion;
import com.portfolio.prueba.Interface.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping ("/educacion")
@CrossOrigin (origins = "http://localhost:4200")
public class EducacionController {
    @Autowired IEducacionService ieducacionService;
    
    @GetMapping("/traer")
    public List<Educacion> getEducacion(){
    return ieducacionService.getEducacion();
    }
    
    @PostMapping("/crear")
    public void createEducacion(@RequestBody Educacion edu){
        ieducacionService.saveEducacion(edu);
       // return "El elemento fue creado correctamente";
        
    }
    
    /*@PostMapping
    public Persona agregar(@RequestBody Persona p){
        return service.add(p);
    } */
    
    @DeleteMapping("/eliminar/{id}")
    public void deleteEducacion(@PathVariable Long id){
        ieducacionService.deleteEducacion(id);
        // return "El elemento fue eliminado correctamente";
        
    }
    
    /* @DeleteMapping(path = {"/{id}"})
        public Educacion borrarEducacion(@PathVariable ("id") Long id){
            return ieducacionService.borrarEducacion(id);
        }
    */
    
    @PutMapping("/editar/{id}")
    public Educacion editarEducacion(@PathVariable("id") Long id,
            @RequestBody Educacion educacion) {
        educacion.setId(id);
        ieducacionService.saveEducacion(educacion);
        return educacion;
    }
    
    @GetMapping(path = {"/{id}"})
    public Educacion listarId(@PathVariable ("id") Long id){
    return ieducacionService.findEducacion(id);
    }
}
