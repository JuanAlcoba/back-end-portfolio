
package com.portfolio.prueba.Service;

import com.portfolio.prueba.Entity.Proyectos;
import com.portfolio.prueba.Interface.IProyectosService;
import com.portfolio.prueba.repository.IProyectosRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpProyectosService implements IProyectosService{

    @Autowired IProyectosRepository iproyectosrepository;
    
    
    @Override
    public List<Proyectos> getProyectos() {
        List<Proyectos> proyectos = iproyectosrepository.findAll();
        return proyectos;
    }

    @Override
    public void saveProyectos(Proyectos pro) {
        iproyectosrepository.save(pro);
    }

    @Override
    public void deleteProyectos(Long id) {
        iproyectosrepository.deleteById(id);
    }

    @Override
    public Proyectos findProyectos(Long id) {
        Proyectos proyectos = iproyectosrepository.findById(id).orElse(null);
        return proyectos;
    }

    /* @Override
    public Proyectos borrarProyectos(Long id) {
        Proyectos e= iproyectosrepository.findOne(id);
        if(e != null){
           iproyectosrepository.delete(e);
        }
        return e;
    } */
    
    
}
