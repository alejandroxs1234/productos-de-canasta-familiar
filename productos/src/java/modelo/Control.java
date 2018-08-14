/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Administrador1
 */
@Named(value = "control")
@RequestScoped
public class Control {

    /**
     * Creates a new instance of Control
     */
    public Control() {
    }
    public String aceptar(){
        return "registros";
    }
}
