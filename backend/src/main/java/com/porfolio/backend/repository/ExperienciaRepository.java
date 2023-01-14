
package com.porfolio.backend.repository;

import com.porfolio.backend.model.Experencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experencia, Long>{
    
}
