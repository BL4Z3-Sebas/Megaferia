package coreMegaferia;


import java.util.ArrayList;


public class Stand {
    private int id;
    private float precio;
    private  ArrayList editoriales;

    public void setId(int id) {
        this.id = id;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setEditoriales(ArrayList editoriales) {
        this.editoriales = editoriales;
    }

    @Override
    public String toString() {
        return "Stand{" + "id=" + id + ", precio=" + precio + ", editoriales=" + editoriales + '}';
    }
    
    
}
