package bois.chernichkin.javatesttask.Model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double x, double y, double width, double height, Color color) {
        super(x, y, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillRect(x, y, width, height);
    }

    @Override
    public String toString() {
        return "Rectangle: x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + ", color=" + color.toString();
    }
    public double getWidth()
    {
        return width;
    }
    public double getHeight()
    {
        return height;
    }
}