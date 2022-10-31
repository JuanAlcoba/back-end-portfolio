
package com.portfolio.prueba.Interface;

import com.portfolio.prueba.Entity.Proyectos;
import java.util.List;


public interface IProyectosService {
    
    public List<Proyectos> getProyectos();
    
    
    public void saveProyectos (Proyectos pro);
    
    
    public void deleteProyectos (Long id);
    
   // public Proyectos borrarProyectos (Long id);
    
    public Proyectos findProyectos (Long id);
    
}
