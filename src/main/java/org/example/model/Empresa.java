package org.example.model;

public class Empresa {
    private String nombreEmpresa;
    private Empleado empleados;

    public Empresa(String nombreEmpresa, Empleado empleados) {
        this.nombreEmpresa = nombreEmpresa;
        this.empleados = empleados;
    }

    public void mostrarEmpleados() {
        System.out.println("Empleados de " + nombreEmpresa + ":");
        System.out.println("Nombre: " + empleados.nombre);
        empleados.mostrarSalario();
        empleados.calcularBono();
        empleados.calcularSalarioTotal();
        empleados.aplicaDescuento();
    }
}
