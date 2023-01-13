
package com.porfolio.backend.model;

import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Experencia {
    
    private int id;
    private String nombreEmpresa;
    private String puesto;
    private String descripcion;
    private String urlLogo;
    private Date desde;
    private Date hasta;

    public Experencia() {
    }

    public Experencia(int id, String nombreEmpresa, String puesto, String descripcion, String urlLogo, Date desde, Date hasta) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.puesto = puesto;
        this.descripcion = descripcion;
        this.urlLogo = urlLogo;
        this.desde = desde;
        this.hasta = hasta;
    }
   
    
}
