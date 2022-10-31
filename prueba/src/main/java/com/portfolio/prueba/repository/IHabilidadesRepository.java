
package com.portfolio.prueba.repository;

import com.portfolio.prueba.Entity.Habilidades;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHabilidadesRepository extends JpaRepository<Habilidades, Long>{

    
}
