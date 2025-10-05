package br.edu.fatec.factory.shapes;

import br.edu.fatec.factory.interfaces.Calculable;

public class Circle implements Calculable {

    private double pi = 3.1415926535898;
    private double radius;

    public Circle(Double radius){
        this.radius = radius;
    }

    @Override
    public Double calcularArea(){
        return pi * (radius * radius);
    }


}
