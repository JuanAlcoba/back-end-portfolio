
package com.portfolio.prueba.Service;

import com.portfolio.prueba.Entity.Experiencia;
import com.portfolio.prueba.Interface.IExperienciaService;
import com.portfolio.prueba.repository.IExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpExperienciaService implements IExperienciaService{

    @Autowired IExperienciaRepository iexperienciarepository;
    
    
    @Override
    public List<Experiencia> getExperiencia() {
        List<Experiencia> experiencia = iexperienciarepository.findAll();
        return experiencia;
    }

    @Override
    public void saveExperiencia(Experiencia edu) {
        iexperienciarepository.save(edu);
    }

    @Override
    public void deleteExperiencia(Long id) {
        iexperienciarepository.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(Long id) {
        Experiencia experiencia = iexperienciarepository.findById(id).orElse(null);
        return experiencia;
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
