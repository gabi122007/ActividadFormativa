package org.example.model;

public class Tienda {

    public void procesarPedido(Cliente cliente, String producto, int cantidad){
        Pedido pedido = new Pedido(cliente, producto, cantidad);
        System.out.println("Pedido procesado correctamente");
        pedido.mostrarDetalle();

    }
}
