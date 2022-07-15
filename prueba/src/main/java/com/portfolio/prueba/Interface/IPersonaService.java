
package com.portfolio.prueba.Interface;

import com.portfolio.prueba.Entity.Persona;
import java.util.List;




public interface IPersonaService {
    //Traer una persona
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo Persona
    public void savePersona (Persona pers);
    
    //Eliminar un objeto (usuario)
    public void deletePersona (Long id);
    
    //Buscar Persona
    public Persona findPersona (Long id);
}
