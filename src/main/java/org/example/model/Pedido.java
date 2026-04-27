package org.example.model;

import javax.swing.*;

public class Pedido {
    private Cliente cliente;
    private String producto;
    private int cantidad;

    public Pedido(Cliente cliente, String producto, int cantidad) {
        this.cliente = cliente;
        this.producto = producto;
        this.cantidad = cantidad;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void mostrarDetalle(){
        System.out.println("--- Detalle del Pedido ---");
        System.out.println("Cliente: " + cliente.nombre);
        System.out.println("Producto: " + producto);
        System.out.println("Cantidad: " + cantidad);
    }
}
