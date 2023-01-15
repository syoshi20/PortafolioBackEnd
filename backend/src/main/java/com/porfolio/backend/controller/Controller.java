
package com.porfolio.backend.controller;

import com.porfolio.backend.model.Perfil;
import com.porfolio.backend.service.IPerfilService;
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
    
  @Autowired
  public  IPerfilService perServ;
  
  //Controlador de Perfil
  @PostMapping("/new/perfil")  
  public void addPerfil(@RequestBody Perfil per){
   perServ.savePerfil(per);
  }  
    
  @GetMapping("/ver/perfil")
  @ResponseBody
  public List<Perfil> verPerfil(){
      return perServ.verPerfil();
  }
  
  @DeleteMapping("/delete/{id}")
  public void borrarPerfil(@PathVariable Long id ){
      perServ.borrarPerfil(id);
  }
  
  @PutMapping("/perfil/edit/{id}")
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
}
