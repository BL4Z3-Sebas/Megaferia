package coreMegaferia;


import java.util.ArrayList;


public class Stand {
    private int id;
    private float precio;
    private  ArrayList editoriales;


    public Stand(int id, float precio, ArrayList editoriales) {
        this.id = id;
        this.precio = precio;
        this.editoriales = editoriales;
    }

    public Stand() {
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public float getPrecio() {
        return precio;
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
    public ArrayList getEditoriales() {
        return editoriales;
    }

    public void setEditoriales(ArrayList editoriales) {
        this.editoriales = editoriales;
    }
    

}
