package br.edu.fatec.factory.shapes;

import br.edu.fatec.factory.interfaces.Calculable;

public class Triangle implements Calculable {

    private double base;
    private double height;

    public Triangle(Double base, Double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public Double calcularArea(){
       return (base * height)/2;
    }
}
