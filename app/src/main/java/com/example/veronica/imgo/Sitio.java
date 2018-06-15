package com.example.veronica.imgo;

import java.io.Serializable;

public class Sitio implements Serializable{
    private int idSitio;
    private int idCategoria;
    private String descripcion;
    private String nombreSitio;
    private float precioMax;
    private float precioMin;
    private int imagen;

    public Sitio() {
    }


    public Sitio(int idSitio, int idCategoria, String descripcion, String nombreSitio, float precioMax, float precioMin, int imagen) {
        this.idSitio = idSitio;
        this.idCategoria = idCategoria;
        this.descripcion = descripcion;
        this.nombreSitio = nombreSitio;
        this.precioMax = precioMax;
        this.precioMin = precioMin;
        this.imagen = imagen;
    }


    public int getIdSitio() {
        return idSitio;
    }


    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombreSitio() {
        return nombreSitio;
    }

    public float getPrecioMax() {
        return precioMax;
    }

    public float getPrecioMin() {
        return precioMin;
    }

    public void setIdSitio(int idSitio) {
        this.idSitio = idSitio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setNombreSitio(String nombreSitio) {
        this.nombreSitio = nombreSitio;
    }

    public void setPrecioMax(float precioMax) {
        this.precioMax = precioMax;
    }

    public void setPrecioMin(float precioMin) {
        this.precioMin = precioMin;
    }



    @Override
    public String toString() {
        return nombreSitio;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }
}


