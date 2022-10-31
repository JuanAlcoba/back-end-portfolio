
package com.portfolio.prueba.Interface;

import com.portfolio.prueba.Entity.Habilidades;
import java.util.List;


public interface IHabilidadesService {
    
    public List<Habilidades> getHabilidades();
    
    
    public void saveHabilidades (Habilidades hab);
    
    
    public void deleteHabilidades (Long id);
    
   // public Habilidades borrarHabilidades (Long id);
    
    public Habilidades findHabilidades (Long id);
    
}
