package br.edu.fatec.factory.shapes;

import br.edu.fatec.factory.interfaces.Calculable;

public class Square implements Calculable {

    private Double side;

    public Square(Double side){
        this.side = side;
    }

    @Override
    public Double calcularArea() {
        return side * side;
    }

}
