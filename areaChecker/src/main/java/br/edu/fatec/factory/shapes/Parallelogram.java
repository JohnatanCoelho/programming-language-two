package br.edu.fatec.factory.shapes;

import br.edu.fatec.factory.interfaces.Calculable;

public class Parallelogram implements Calculable {

    private double base;
    private double height;

    public Parallelogram(Double base, Double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public Double calcularArea(){
        return base * height;
    }


}
