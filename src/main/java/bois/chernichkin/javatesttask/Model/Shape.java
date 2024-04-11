package bois.chernichkin.javatesttask.Model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public abstract class Shape {
    protected double x;
    protected double y;
    protected Color color;

    public Shape(double x, double y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public abstract void draw(GraphicsContext gc);

    @Override
    public abstract String toString();

    public double getX()
    {
        return x;
    }
    public double getY()
    {
        return y;
    }
}