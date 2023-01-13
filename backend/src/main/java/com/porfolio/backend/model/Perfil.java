
package com.porfolio.backend.model;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Perfil {
    private long id;
    private String nombre;
    private String apellido;
    private String provincia;
    private String localidad;
    private String urlFoto;
    private String titulos[];
    private String acercaDe;

    public Perfil() {
    }

    public Perfil(long id, String nombre, String apellido, String provincia, String localidad, String urlFoto, String[] titulos, String acercaDe) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.provincia = provincia;
        this.localidad = localidad;
        this.urlFoto = urlFoto;
        this.titulos = titulos;
        this.acercaDe = acercaDe;
    }
    
    
}
