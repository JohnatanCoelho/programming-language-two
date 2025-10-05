package br.edu.fatec.factory.shapes;

import br.edu.fatec.factory.interfaces.Calculable;

public class Cube implements Calculable {

    private double edge;

    public Cube(Double edge){
        this.edge = edge;
    }

    @Override
    public Double calcularArea(){
        return 6 * (edge * edge);
    }
}
