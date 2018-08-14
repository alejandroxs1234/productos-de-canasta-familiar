/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Administrador1
 */
@Named(value = "listas")
@RequestScoped
public class Listas {
    private String nombre; 
    private String usuario; 
    private String clave;
    
    
    public Listas() {
    }
    public String getNombre() {
        return nombre;
    }
       public void setNombre(String nombre) {
           this.nombre = nombre;
       }  
       public String getUsuario(){
            return usuario;
       }
      public void setUsuario(String usuario) {
       this.usuario = usuario;
       }
       public String getClave(){
           return clave;
       }
       public void setClave(String clave){
           this.clave = clave;
       }
        
 }
