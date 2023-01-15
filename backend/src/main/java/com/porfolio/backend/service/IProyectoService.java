
package com.porfolio.backend.service;

import com.porfolio.backend.model.Proyecto;
import java.util.List;


public interface IProyectoService {
    
    public List<Proyecto> verProyecto();
    
    public void saveProyecto(Proyecto pro);
    
    public void borrarProyecto(Long id);
    
    public Proyecto buscarProyecto(Long id);  
}
