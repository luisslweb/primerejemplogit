package com.myjsfexample1.view.controller;

import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class UsuarioController implements Serializable
{
    private String nombre = "luis fernando saisa lopez";

    public UsuarioController()
    {
        //...
    }



    public String msg()
    {
        return this.nombre;
    }

}
