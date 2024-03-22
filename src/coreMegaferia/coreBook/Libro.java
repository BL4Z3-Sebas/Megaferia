/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coreMegaferia.coreBook;

/**
 *
 * @author cotes
 */
public abstract class Libro {
    protected String titulo;
    protected String nombre;
    protected String isnb;
    protected String genero;

    public Libro(String titulo, String nombre, String isnb, String genero) {
        this.titulo = titulo;
        this.nombre = nombre;
        this.isnb = isnb;
        this.genero = genero;
    }
    
    
}
