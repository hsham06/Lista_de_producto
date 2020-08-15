package com.example.mohsin.customlistview;

public class userHelperClass {

    String nProducto, nCantidad, nDescripcion, nPrecio;

    public userHelperClass(String nProducto, String nCantidad, String nDescripcion, String nPrecio) {
        this.nProducto = nProducto;
        this.nCantidad = nCantidad;
        this.nDescripcion = nDescripcion;
        this.nPrecio = nPrecio;
    }



    public String getnProducto() {
        return nProducto;
    }

    public void setnProducto(String nProducto) {
        this.nProducto = nProducto;
    }

    public String getnCantidad() {
        return nCantidad;
    }

    public void setnCantidad(String nCantidad) {
        this.nCantidad = nCantidad;
    }

    public String getnDescripcion() {
        return nDescripcion;
    }

    public void setnDescripcion(String nDescripcion) {
        this.nDescripcion = nDescripcion;
    }

    public String getnPrecio() {
        return nPrecio;
    }

    public void setnPrecio(String nPrecio) {
        this.nPrecio = nPrecio;
    }
}
