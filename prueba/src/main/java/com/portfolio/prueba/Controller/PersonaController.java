
package com.portfolio.prueba.Controller;

import com.portfolio.prueba.Entity.Persona;
import com.portfolio.prueba.Interface.IPersonaService;
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
@RequestMapping ("/personas")
@CrossOrigin (origins = "http://localhost:4200")

public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping("/traer")
    public List<Persona> getPersona() {
        return ipersonaService.getPersona();
        
    }
    
    @PostMapping("/crear")
    public String createPersona(@RequestBody Persona pers){
        ipersonaService.savePersona(pers);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("/borrar/{id}")
    public String deletePersona(@PathVariable Long id) {
        ipersonaService.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    //URL puerto/Personas/editar/
    @PutMapping("/editar/{id}")
    public Persona editarPersona(@PathVariable("id") Long id,
            @RequestBody Persona pers) {
        pers.setId(id);
        ipersonaService.savePersona(pers);
        return pers;
    }
    
    //forzado
    @GetMapping("/traer/perfil")
    public Persona findPersona() {
        return ipersonaService.findPersona((long)1);
    }
}
