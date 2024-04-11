package bois.chernichkin.javatesttask.Logic;

import bois.chernichkin.javatesttask.Model.Circle;
import bois.chernichkin.javatesttask.Model.Rectangle;
import bois.chernichkin.javatesttask.Model.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateListTest {

    @Test
    void fillList() {
        CreateList createList = new CreateList();

        assertEquals(3, createList.getList().size());
    }

    @Test
    void getList() {
        CreateList createList = new CreateList();

        int actualSize = createList.getList().size();

        assertEquals(3, actualSize);
    }

    @Test
    void getCircle() {
        CreateList createList = new CreateList();

        Circle circle = createList.getCircle();

        assertEquals(1, circle.getX());
        assertEquals(1, circle.getY());
        assertEquals(10, circle.getRadius());
    }

    @Test
    void getRectangle() {
        CreateList createList = new CreateList();

        Rectangle rectangle = createList.getRectangle();

        assertEquals(1, rectangle.getX());
        assertEquals(1, rectangle.getY());
        assertEquals(10, rectangle.getWidth());
        assertEquals(10, rectangle.getHeight());
    }

    @Test
    void getTriangle() {
        CreateList createList = new CreateList();

        Triangle triangle = createList.getTriangle();

        assertEquals(1, triangle.getX());
        assertEquals(1, triangle.getY());
        assertEquals(10, triangle.getSideLength());
    }
}