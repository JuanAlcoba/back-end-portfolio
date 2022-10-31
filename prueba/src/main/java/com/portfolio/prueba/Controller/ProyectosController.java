
package com.portfolio.prueba.Controller;

import com.portfolio.prueba.Entity.Proyectos;
import com.portfolio.prueba.Interface.IProyectosService;
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
@RequestMapping ("/proyectos")
@CrossOrigin (origins = "http://localhost:4200")
public class ProyectosController {
    @Autowired IProyectosService iproyectosService;
    
    @GetMapping("/traer")
    public List<Proyectos> getProyectos(){
    return iproyectosService.getProyectos();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear")
    public void createProyectos(@RequestBody Proyectos pro){
        iproyectosService.saveProyectos(pro);
       // return "El elemento fue creado correctamente";
        
    }
    
    /*@PostMapping
    public Persona agregar(@RequestBody Persona p){
        return service.add(p);
    } */
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/eliminar/{id}")
    public void deleteProyectos(@PathVariable Long id){
        iproyectosService.deleteProyectos(id);
        // return "El elemento fue eliminado correctamente";
        
    }
    
    /* @DeleteMapping(path = {"/{id}"})
        public Proyectos borrarProyectos(@PathVariable ("id") Long id){
            return iproyectosService.borrarProyectos(id);
        }
    */
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public Proyectos editarProyectos(@PathVariable("id") Long id,
            @RequestBody Proyectos proyectos) {
        proyectos.setId(id);
        iproyectosService.saveProyectos(proyectos);
        return proyectos;
    }
  
    @GetMapping(path = {"/{id}"})
    public Proyectos listarId(@PathVariable ("id") Long id){
    return iproyectosService.findProyectos(id);
    }
}
