package bois.chernichkin.javatesttask.Model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Triangle extends Shape {
    private double sideLength;

    public Triangle(double x, double y, double sideLength, Color color) {
        super(x, y, color);
        this.sideLength = sideLength;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillPolygon(new double[]{x, x + sideLength, x + sideLength / 2},
                new double[]{y + sideLength, y + sideLength, y}, 3);
    }

    @Override
    public String toString() {
        return "Triangle: x=" + x + ", y=" + y + ", sideLength=" + sideLength + ", color=" + color.toString();
    }
    public double getSideLength()
    {
        return sideLength;
    }
}