
package com.porfolio.backend.service;

import com.porfolio.backend.model.Experencia;
import java.util.List;

public interface IExperienciaService {
   public List<Experencia> verExperiencia();
    
    public void crearExperiencia(Experencia exp);
    
    public void borrarExperiencia(Long id);
    
    public Experencia buscarExperiencia(Long id); 
}
