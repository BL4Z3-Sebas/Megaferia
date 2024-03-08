package coreMegaferia;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author cotes
 */
public class Editorial {
    private String nit;
    private String nombre;
    private String direccion;
    private ArrayList<Stand> stands;
            

    public Editorial(String nit, String nombre, String direccion) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
    }
           
}
