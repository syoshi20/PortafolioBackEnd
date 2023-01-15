
package com.porfolio.backend.service;

import com.porfolio.backend.model.Perfil;
import java.util.List;


public interface IPerfilService {
    
    public List<Perfil> verPerfil();
    
    public void savePerfil(Perfil per);
    
    public void borrarPerfil(Long id);
    
    public Perfil buscarPerfil(Long id);
    
    
}
