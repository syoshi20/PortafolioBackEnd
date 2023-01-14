
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
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String titulo;
    private String nombreInstituto;
    private String urlLogo;
    private boolean estado;
    private Date desde;
    private Date hasta;

    public Educacion() {
    }

    public Educacion(Long id, String titulo, String nombreInstituto, String urlLogo, boolean estado, Date desde, Date hasta) {
        this.id = id;
        this.titulo = titulo;
        this.nombreInstituto = nombreInstituto;
        this.urlLogo = urlLogo;
        this.estado = estado;
        this.desde = desde;
        this.hasta = hasta;
    }

    
    
}
