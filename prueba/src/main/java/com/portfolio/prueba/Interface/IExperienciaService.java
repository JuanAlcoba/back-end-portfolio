
package com.portfolio.prueba.Interface;

import com.portfolio.prueba.Entity.Experiencia;
import java.util.List;


public interface IExperienciaService {
    
    public List<Experiencia> getExperiencia();
    
    
    public void saveExperiencia (Experiencia edu);
    
    
    public void deleteExperiencia (Long id);
    
    
    public Experiencia findExperiencia (Long id);
    
}
