package bois.chernichkin.javatesttask.Logic;

import bois.chernichkin.javatesttask.Model.Shape;
import bois.chernichkin.javatesttask.Model.Circle;
import bois.chernichkin.javatesttask.Model.Rectangle;
import bois.chernichkin.javatesttask.Model.Triangle;
import javafx.scene.paint.Color;

import java.util.ArrayList;
import java.util.List;

public class CreateList {
    private List<Shape> shapes;
    private Circle circle;
    private Rectangle rectangle;
    private Triangle triangle;

    void fillList() {
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);
    }

    public CreateList()
    {
        shapes      =    new ArrayList<Shape>();
        circle      =    new Circle(1, 1, 10, Color.RED);
        rectangle   =    new Rectangle(1, 1, 10, 10, Color.RED);
        triangle    =    new Triangle(1, 1, 10, Color.RED);
        fillList();
    }
    public List<Shape> getList()
    {
        return shapes;
    }
    public Circle getCircle()
    {
        return circle;
    }
    public Rectangle getRectangle()
    {
        return rectangle;
    }
    public Triangle getTriangle()
    {
        return triangle;
    }
}