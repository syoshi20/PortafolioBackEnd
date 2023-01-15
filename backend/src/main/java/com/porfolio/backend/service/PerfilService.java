
package com.porfolio.backend.service;

import com.porfolio.backend.model.Perfil;
import com.porfolio.backend.repository.PerfilRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PerfilService implements IPerfilService{
    
    @Autowired
    public PerfilRepository perfilRepo;

    @Override
    public List<Perfil> verPerfil() {
    return perfilRepo.findAll();
    }

    @Override
    public void savePerfil(Perfil per) {
        perfilRepo.save(per);
    }

    @Override
    public void borrarPerfil(Long id) {
        perfilRepo.deleteById(id);
    }

    @Override
    public Perfil buscarPerfil(Long id) {
        return perfilRepo.findById(id).orElse(null);
    }
    
}
