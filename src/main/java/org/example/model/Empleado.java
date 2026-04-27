package org.example.model;

public class Empleado  {
     String nombre;
    private double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public void mostrarSalario (){
        System.out.println("Salario base: " + salarioBase );
    }

    public double calcularBono() {
        double bono =  salarioBase * 0.10;
        System.out.println("Bono calculado: " + bono);
        return bono;
    }

    public double calcularSalarioTotal() {
        return salarioBase + calcularBono();
    }

    public boolean aplicaDescuento() {
        boolean desc =  salarioBase > 400;
        System.out.println("Aplica descuento: " + desc);
        return desc;
    }
}
