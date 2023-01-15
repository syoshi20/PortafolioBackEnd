
package com.porfolio.backend.controller;

import com.porfolio.backend.model.Educacion;
import com.porfolio.backend.model.Experencia;
import com.porfolio.backend.model.Perfil;
import com.porfolio.backend.model.Proyecto;
import com.porfolio.backend.model.Skill;
import com.porfolio.backend.service.IEducacionService;
import com.porfolio.backend.service.IExperienciaService;
import com.porfolio.backend.service.IPerfilService;
import com.porfolio.backend.service.IProyectoService;
import com.porfolio.backend.service.ISkillService;
import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
  //Controlador de Perfil
    @Autowired
  public  IPerfilService perServ;
  
  @PostMapping("/new/perfil")  
  public void addPerfil(@RequestBody Perfil per){
   perServ.savePerfil(per);
  }  
    
  @GetMapping("/ver/perfil")
  @ResponseBody
  public List<Perfil> verPerfil(){
      return perServ.verPerfil();
  }
  
  @DeleteMapping("/delete/perfil/{id}")
  public void borrarPerfil(@PathVariable Long id ){
      perServ.borrarPerfil(id);
  }
  
  @PutMapping("/edit/perfil/{id}")
  public Perfil editPerfil(@PathVariable Long id,
                           @RequestParam ("nombre")String nuevoNombre,
                           @RequestParam ("apellido")String nuevoApellido,
                           @RequestParam ("titulo")String []nuevoTitulo,
                           @RequestParam ("localidad")String nuevoLocal,
                           @RequestParam ("provincia")String nuevoProv,
                           @RequestParam ("acercaDe")String nuevoAcercaDe,
                           @RequestParam ("urlFoto")String nuevoUrl){
      
      Perfil per=perServ.buscarPerfil(id);
      per.setNombre(nuevoNombre);
      per.setApellido(nuevoApellido);
      per.setTitulos(nuevoTitulo);
      per.setLocalidad(nuevoLocal);
      per.setProvincia(nuevoProv);
      per.setAcercaDe(nuevoAcercaDe);
      per.setUrlFoto(nuevoUrl);
      
      perServ.savePerfil(per);
      
      return per;
  
    }
  
  //Controlador de experiencia
  @Autowired
    public IExperienciaService expServ;
  @PostMapping("/new/experiencia")  
  public void addExperiencia(@RequestBody Experencia exp){
   expServ.saveExperiencia(exp);
  }  
    
  @GetMapping("/ver/experiencia")
  @ResponseBody
  public List<Experencia> verExperiencia(){
      return expServ.verExperiencia();
  }
  
  @DeleteMapping("/delete/experiencia/{id}")
  public void borrarExperiencia(@PathVariable Long id ){
      expServ.borrarExperiencia(id);
  }
  
  @PutMapping("/edit/experiencia/{id}")
  public Experencia editExperiencia(@PathVariable Long id,
                           @RequestParam ("nombre")String nuevoNombre,
                           @RequestParam ("puesto")String nuevoPuesto,
                           @RequestParam ("descripcion")String nuevoDescripcion,
                           @RequestParam ("desde")Date nuevoDesde,
                           @RequestParam ("hasta")Date nuevoHasta,
                           @RequestParam ("urlLogo")String nuevoUrl){
      
      Experencia exp=expServ.buscarExperiencia(id);
      exp.setNombreEmpresa(nuevoNombre);
      exp.setPuesto(nuevoPuesto);
      exp.setDescripcion(nuevoDescripcion);
      exp.setDesde(nuevoDesde);
      exp.setHasta(nuevoHasta);
      exp.setUrlLogo(nuevoUrl);
      
      expServ.saveExperiencia(exp);
      
      return exp;
    }
    //Control de Educacion
     @Autowired
    public IEducacionService eduServ;
  @PostMapping("/new/educacion")  
  public void addEducacion(@RequestBody Educacion edu){
   eduServ.saveEducacion(edu);
  }  
    
  @GetMapping("/ver/educacion")
  @ResponseBody
  public List<Educacion> verEducacion(){
      return eduServ.verEducacion();
  }
  
  @DeleteMapping("/delete/educacion/{id}")
  public void borrarEducacion(@PathVariable Long id ){
      eduServ.borrarEducacion(id);
  }
  
  @PutMapping("/edit/educacion/{id}")
  public Educacion editEducacion(@PathVariable Long id,
                           @RequestParam ("nombre")String nuevoNombre,
                           @RequestParam ("titulo")String nuevoTitulo,
                           @RequestParam ("estado")Boolean nuevoEstado,
                           @RequestParam ("desde")Date nuevoDesde,
                           @RequestParam ("hasta")Date nuevoHasta,
                           @RequestParam ("urlLogo")String nuevoUrl){
      
      Educacion edu=eduServ.buscarEducacion(id);
      edu.setNombreInstituto(nuevoNombre);
      edu.setTitulo(nuevoTitulo);
      edu.setEstado(nuevoEstado);
      edu.setDesde(nuevoDesde);
      edu.setHasta(nuevoHasta);
      edu.setUrlLogo(nuevoUrl);
      
      eduServ.saveEducacion(edu);
      
      return edu;
    }
    
    //Controlador de Skill

     @Autowired
     public ISkillService skillServ;
     @PostMapping("/new/skill")  
     public void addSkill(@RequestBody Skill skil){
        skillServ.saveSkill(skil);
     }  
    
       @GetMapping("/ver/skill")
       @ResponseBody
       public List<Skill> verSkill(){
         return skillServ.verSkill();
       }
  
       @DeleteMapping("/delete/skill/{id}")
       public void borrarSkill(@PathVariable Long id ){
       skillServ.borrarSkill(id);         
       }
  
        @PutMapping("/edit/skill/{id}")
       public Skill editSkill(@PathVariable Long id,
                           @RequestParam ("nombre")String nuevoNombre,
                           @RequestParam ("porcentaje")int nuevoPorcen){
      
       Skill skl=skillServ.buscarSkill(id);
       skl.setNombre(nuevoNombre);
       skl.setPorcentaje(nuevoPorcen);
      
       skillServ.saveSkill(skl);
      
       return skl;
      }
       //Controlador Proyecto
         @Autowired
     public IProyectoService proyecServ;
     @PostMapping("/new/proyecto")  
     public void addProyecto(@RequestBody Proyecto proyec){
        proyecServ.saveProyecto(proyec);
     }  
    
       @GetMapping("/ver/proyecto")
       @ResponseBody
       public List<Proyecto> verProyecto(){
         return proyecServ.verProyecto();
       }
  
       @DeleteMapping("/delete/proyecto/{id}")
       public void borrarProyecto(@PathVariable Long id ){
       proyecServ.borrarProyecto(id);         
       }
  
        @PutMapping("/edit/proyecto/{id}")
       public Proyecto editProyecto(@PathVariable Long id,
                                    @RequestParam ("nombre")String nuevoNombre,
                                    @RequestParam ("descripcion")String nuevoDescrip,
                                    @RequestParam ("url")String nuevoLink ){
      
       Proyecto proyec=proyecServ.buscarProyecto(id);
       proyec.setNombre(nuevoNombre);
       proyec.setDescripcion(nuevoDescrip);
       proyec.setUrl(nuevoLink);
      
       proyecServ.saveProyecto(proyec);
      
       return proyec;
      }
}
