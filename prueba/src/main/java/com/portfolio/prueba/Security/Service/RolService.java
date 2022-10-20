
package com.portfolio.prueba.Security.Service;

import com.portfolio.prueba.Security.Entity.Rol;
import com.portfolio.prueba.Security.Enums.RolNombre;
import com.portfolio.prueba.Security.Repository.RolRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RolService {
    
    @Autowired
    RolRepository rolRepository;
    
    public Optional<Rol> getbyRolNombre (RolNombre rolNombre) {
        return rolRepository.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        rolRepository.save(rol);
    }
}
