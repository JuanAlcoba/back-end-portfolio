
package com.portfolio.prueba.Controller;

import com.portfolio.prueba.Entity.Headers;
import com.portfolio.prueba.Interface.IHeadersService;
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
@RequestMapping ("/headers")
@CrossOrigin (origins = "http://localhost:4200")
public class HeadersController {
    @Autowired IHeadersService iheadersService;
    
    @GetMapping("/traer")
    public List<Headers> getHeaders(){
    return iheadersService.getHeaders();
    }
    
    @PreAuthorize("hasRole('ADMIN')")
    @PostMapping("/crear")
    public void createHeaders(@RequestBody Headers edu){
        iheadersService.saveHeaders(edu);
       // return "El elemento fue creado correctamente";
        
    }
    
    /*@PostMapping
    public Persona agregar(@RequestBody Persona p){
        return service.add(p);
    } */
    
    @PreAuthorize("hasRole('ADMIN')")
    @DeleteMapping("/eliminar/{id}")
    public void deleteHeaders(@PathVariable Long id){
        iheadersService.deleteHeaders(id);
        // return "El elemento fue eliminado correctamente";
        
    }
    
    /* @DeleteMapping(path = {"/{id}"})
        public Headers borrarHeaders(@PathVariable ("id") Long id){
            return iheadersService.borrarHeaders(id);
        }
    */
    
    @PreAuthorize("hasRole('ADMIN')")
    @PutMapping("/editar/{id}")
    public Headers editarHeaders(@PathVariable("id") Long id,
            @RequestBody Headers headers) {
        headers.setId(id);
        iheadersService.saveHeaders(headers);
        return headers;
    }
  
    @GetMapping(path = {"/{id}"})
    public Headers listarId(@PathVariable ("id") Long id){
    return iheadersService.findHeaders(id);
    }
}
