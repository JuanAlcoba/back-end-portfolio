
package com.portfolio.prueba.repository;

import com.portfolio.prueba.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface IPersonaRepository extends JpaRepository<Persona,Long>{
    
}
