package br.edu.fatec.factory.shapes;

import br.edu.fatec.factory.interfaces.Calculable;

public class Trapezo implements Calculable {

    private double largerBase;
    private double smallerBase;
    private double height;

    public Trapezo(Double largerBase, Double smallerBase, Double height){
       this.largerBase = largerBase;
       this.smallerBase = smallerBase;
        this.height = height;
    }

    @Override
    public Double calcularArea(){
        return ((largerBase + smallerBase) * height)/2;
    }
}
