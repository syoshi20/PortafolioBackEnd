
package com.porfolio.backend.service;

import com.porfolio.backend.model.Skill;
import java.util.List;


public interface ISkillService {
    
    public List<Skill> verSkill();
    
    public void saveSkill(Skill skill);
    
    public void borrarSkill(Long id);
    
    public Skill buscarSkill(Long id);  
    
}
