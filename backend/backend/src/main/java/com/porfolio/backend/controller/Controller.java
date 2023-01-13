
package com.porfolio.backend.controller;

import com.porfolio.backend.model.Perfil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    Perfil acercaDe= new Perfil();
  
  @PostMapping("/new/perfil")  
  public void addPerfil(@RequestBody Perfil per){
  acercaDe= per;
  }  
    
  @GetMapping("/ver/acercaDe")
  @ResponseBody
  public Perfil mostrarPerfil(){
      return acercaDe;
  }
}
