
package com.portfolio.prueba.Interface;

import com.portfolio.prueba.Entity.Educacion;
import java.util.List;


public interface IEducacionService {
    
    public List<Educacion> getEducacion();
    
    
    public void saveEducacion (Educacion edu);
    
    
    public void deleteEducacion (Long id);
    
   // public Educacion borrarEducacion (Long id);
    
    public Educacion findEducacion (Long id);
    
}
