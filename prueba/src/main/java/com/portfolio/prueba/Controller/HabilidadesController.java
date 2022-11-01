
package com.portfolio.prueba.Controller;

import com.portfolio.prueba.Entity.Habilidades;
import com.portfolio.prueba.Interface.IHabilidadesService;
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
@RequestMapping ("/habilidades")
@CrossOrigin (origins = "*")
public class HabilidadesController {
    @Autowired IHabilidadesService ihabilidadesService;
    
    @GetMapping("/traer")
    public List<Habilidades> getHabilidades(){
    return ihabilidadesService.getHabilidades();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear")
    public void createHabilidades(@RequestBody Habilidades hab){
        ihabilidadesService.saveHabilidades(hab);
       // return "El elemento fue creado correctamente";
        
    }
    
    /*@PostMapping
    public Persona agregar(@RequestBody Persona p){
        return service.add(p);
    } */
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/eliminar/{id}")
    public void deleteHabilidades(@PathVariable Long id){
        ihabilidadesService.deleteHabilidades(id);
        // return "El elemento fue eliminado correctamente";
        
    }
    
    /* @DeleteMapping(path = {"/{id}"})
        public Habilidades borrarHabilidades(@PathVariable ("id") Long id){
            return ihabilidadesService.borrarHabilidades(id);
        }
    */
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public Habilidades editarHabilidades(@PathVariable("id") Long id,
            @RequestBody Habilidades habilidades) {
        habilidades.setId(id);
        ihabilidadesService.saveHabilidades(habilidades);
        return habilidades;
    }
  
    @GetMapping(path = {"/{id}"})
    public Habilidades listarId(@PathVariable ("id") Long id){
    return ihabilidadesService.findHabilidades(id);
    }
}
