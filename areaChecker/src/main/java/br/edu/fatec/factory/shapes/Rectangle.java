package br.edu.fatec.factory.shapes;

import br.edu.fatec.factory.interfaces.Calculable;

public class Rectangle implements Calculable {

    private double base;
    private double width;

    public Rectangle(Double base, Double width){
        this.base = base;
        this.width = width;
    }

    @Override
    public Double calcularArea(){
        return base * width;
    }

}
