package org.example;

import org.example.model.Cliente;
import org.example.model.Tienda;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana");
        Tienda tienda = new Tienda();

        cliente.realizarPedido(tienda, "Laptop", 10);


    }
}