package br.edu.fatec.factory.shapes;

import br.edu.fatec.factory.interfaces.Calculable;

public class Diamond implements Calculable {

    private double largerDiagonal;
    private double smallerDiagonal;

    public Diamond(Double largerDiagonal, Double smallerDiagonal){
        this.largerDiagonal = largerDiagonal;
        this.smallerDiagonal = smallerDiagonal;
    }

    @Override
    public Double calcularArea(){
        return (largerDiagonal * smallerDiagonal)/2;
    }
}
