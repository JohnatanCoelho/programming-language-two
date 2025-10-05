package br.edu.fatec.factory.shapes;

import br.edu.fatec.factory.interfaces.Calculable;

public class Hexagon implements Calculable {

    private double side;

    public Hexagon(Double side){
        this.side = side;
    }

    @Override
    public Double calcularArea(){
        return ((3 * (side * side)) * Math.sqrt(3))/2;
    }
}
