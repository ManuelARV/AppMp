/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestorarchivos;

import java.io.*;

/**
 *
 * @author Marina
 */
public class Archivo {
    private String categoria;
    private String tipo;
    private String nombre;
    private File fichero;

//Constructores
    
    public Archivo(String categoria, String tipo, String nombre, File fichero) {
        this.categoria = categoria;
        this.tipo = tipo;
        this.nombre = nombre;
        this.fichero = fichero;
    }
    
//Getters y Setters
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public File getFichero() {
        return fichero;
    }

    public void setFichero(File fichero) {
        this.fichero = fichero;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
//método toString

    @Override
    public String toString() {
        return "Archivo{" + "categoria=" + categoria + ", tipo=" + tipo + ", nombre=" + nombre + '}';
    }
    
}
