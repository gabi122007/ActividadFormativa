package org.example;

import org.example.model.Empleado;
import org.example.model.Empresa;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Juan Perez", 500);
        Empresa empresa = new Empresa("Tech Solutions", empleado);
        empresa.mostrarEmpleados();


    }
}