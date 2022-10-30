
package com.portfolio.prueba.repository;

import com.portfolio.prueba.Entity.Headers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHeadersRepository extends JpaRepository<Headers, Long>{

    
}
