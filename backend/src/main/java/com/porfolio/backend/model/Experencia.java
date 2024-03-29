
package com.porfolio.backend.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
@Entity
public class Experencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String nombreEmpresa;
    private String puesto;
    private String descripcion;
    private String urlLogo;
    private Date desde;
    private Date hasta;

    public Experencia() {
    }

    public Experencia(Long id, String nombreEmpresa, String puesto, String descripcion, String urlLogo, Date desde, Date hasta) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.urlLogo = urlLogo;
        this.desde = desde;
        this.hasta = hasta;
    }
    

 
   
    
}
