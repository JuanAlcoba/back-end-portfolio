
package com.portfolio.prueba.repository;

import com.portfolio.prueba.Entity.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEducacionRepository extends JpaRepository<Educacion, Long>{

    // public Educacion findOne(Long id);
    
}
