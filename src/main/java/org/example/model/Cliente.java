package org.example.model;

public class Cliente {
    String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void realizarPedido(Tienda tienda, String producto, int cantidad){
        tienda.procesarPedido(this, producto, cantidad);

    }
}
