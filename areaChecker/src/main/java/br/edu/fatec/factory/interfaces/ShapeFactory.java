package br.edu.fatec.factory.interfaces;

import br.edu.fatec.factory.enums.ShapeType;

public interface ShapeFactory {

    Calculable getShape(ShapeType type, Double[] values);
}
