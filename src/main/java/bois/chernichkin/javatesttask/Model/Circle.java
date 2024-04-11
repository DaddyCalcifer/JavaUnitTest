package bois.chernichkin.javatesttask.Model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends Shape {
    private double radius;

    public Circle(double x, double y, double radius, Color color) {
        super(x, y, color);
        this.radius = radius;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillOval(x, y, radius * 2, radius * 2);
    }

    @Override
    public String toString() {
        return "Circle: x=" + x + ", y=" + y + ", radius=" + radius + ", color=" + color.toString();
    }

    public double getRadius()
    {
        return radius;
    }
}