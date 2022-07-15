
package com.portfolio.prueba.Service;

import com.portfolio.prueba.Entity.Educacion;
import com.portfolio.prueba.Interface.IEducacionService;
import com.portfolio.prueba.repository.IEducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpEducacionService implements IEducacionService{

    @Autowired IEducacionRepository ieducacionrepository;
    
    
    @Override
    public List<Educacion> getEducacion() {
        List<Educacion> educacion = ieducacionrepository.findAll();
        return educacion;
    }

    @Override
    public void saveEducacion(Educacion edu) {
        ieducacionrepository.save(edu);
    }

    @Override
    public void deleteEducacion(Long id) {
        ieducacionrepository.deleteById(id);
    }

    @Override
    public Educacion findEducacion(Long id) {
        Educacion educacion = ieducacionrepository.findById(id).orElse(null);
        return educacion;
    }

    /* @Override
    public Educacion borrarEducacion(Long id) {
        Educacion e= ieducacionrepository.findOne(id);
        if(e != null){
           ieducacionrepository.delete(e);
        }
        return e;
    } */
    
    
}
