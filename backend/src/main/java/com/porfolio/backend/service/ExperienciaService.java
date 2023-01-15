
package com.porfolio.backend.service;

import com.porfolio.backend.model.Experencia;
import com.porfolio.backend.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    public ExperienciaRepository expRepo;

    @Override
    public List<Experencia> verExperiencia() {
        return expRepo.findAll();
    }

    @Override
    public void saveExperiencia(Experencia exp) {
        expRepo.save(exp);
    }

    @Override
    public void borrarExperiencia(Long id) {
        expRepo.deleteById(id);
    }

    @Override
    public Experencia buscarExperiencia(Long id) {
        return expRepo.findById(id).orElse(null);
    }
    
    
}
