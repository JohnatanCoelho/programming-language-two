package br.edu.fatec.main;

import br.edu.fatec.factory.interfaces.Calculable;
import br.edu.fatec.factory.ShapeFactoryImpl;
import br.edu.fatec.factory.enums.ShapeType;

public class Main {
    public static void main(String[] args) {
        ShapeFactoryImpl factory = new ShapeFactoryImpl();

        //SQUARE
        Calculable square = factory.getShape(ShapeType.SQUARE, new Double[]{4.0});
        System.out.printf("Square area: %.2f %n", square.calcularArea());

        //RECTANGLE
        Calculable rectangle = factory.getShape(ShapeType.RECTANGLE, new Double[]{8.0, 4.0});
        System.out.printf("Rectangle area: %.2f %n", rectangle.calcularArea());

        //CIRCLE
        Calculable circle = factory.getShape(ShapeType.CIRCLE, new Double[]{5.0});
        System.out.printf("Circle area: %.2f %n", circle.calcularArea());

        //TRIANGLE
        Calculable triangle = factory.getShape(ShapeType.TRIANGLE, new Double[]{5.0, 10.0});
        System.out.printf("Triangle area: %.2f %n", triangle.calcularArea());

        //PARALLELOGRAM
        Calculable parallelogram = factory.getShape(ShapeType.PARALLELOGRAM, new Double[]{2.5, 3.7});
        System.out.printf("Parallelogram area: %.2f %n", parallelogram.calcularArea());

        //TRAPEZO
        Calculable trapezo = factory.getShape(ShapeType.TRAPEZO, new Double[]{8.0, 3.0, 5.0});
        System.out.printf("Trapezo area: %.2f %n", trapezo.calcularArea());

        //HEXAGON
        Calculable hexagon = factory.getShape(ShapeType.HEXAGON, new Double[]{5.0});
        System.out.printf("Hexagon area: %.2f %n", hexagon.calcularArea());

        //DIAMOND
        Calculable diamond = factory.getShape(ShapeType.DIAMOND, new Double[]{3.0, 7.0});
        System.out.printf("Diamond area: %.2f %n", diamond.calcularArea());

        //CUBE
        Calculable cube = factory.getShape(ShapeType.CUBE, new Double[]{2.0});
        System.out.printf("Cube area: %.2f %n", cube.calcularArea());
    }
}