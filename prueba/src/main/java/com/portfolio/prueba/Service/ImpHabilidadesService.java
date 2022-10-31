
package com.portfolio.prueba.Service;

import com.portfolio.prueba.Entity.Habilidades;
import com.portfolio.prueba.Interface.IHabilidadesService;
import com.portfolio.prueba.repository.IHabilidadesRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpHabilidadesService implements IHabilidadesService{

    @Autowired IHabilidadesRepository ihabilidadesrepository;
    
    
    @Override
    public List<Habilidades> getHabilidades() {
        List<Habilidades> habilidades = ihabilidadesrepository.findAll();
        return habilidades;
    }

    @Override
    public void saveHabilidades(Habilidades hab) {
        ihabilidadesrepository.save(hab);
    }

    @Override
    public void deleteHabilidades(Long id) {
        ihabilidadesrepository.deleteById(id);
    }

    @Override
    public Habilidades findHabilidades(Long id) {
        Habilidades habilidades = ihabilidadesrepository.findById(id).orElse(null);
        return habilidades;
    }

    /* @Override
    public Habilidades borrarHabilidades(Long id) {
        Habilidades e= ihabilidadesrepository.findOne(id);
        if(e != null){
           ihabilidadesrepository.delete(e);
        }
        return e;
    } */
    
    
}
