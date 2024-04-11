package bois.chernichkin.javatesttask.Logic;

import bois.chernichkin.javatesttask.Model.Circle;
import bois.chernichkin.javatesttask.Model.Rectangle;
import bois.chernichkin.javatesttask.Model.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreateListTest {

    @Test
    void fillList() {
        // Arrange & Act
        CreateList createList = new CreateList();

        // Assert
        assertEquals(3, createList.getList().size());
    }

    @Test
    void getList() {
        // Arrange
        CreateList createList = new CreateList();

        // Act
        int actualSize = createList.getList().size();

        // Assert
        assertEquals(3, actualSize);
    }

    @Test
    void getCircle() {
        // Arrange
        CreateList createList = new CreateList();

        // Act
        Circle circle = createList.getCircle();

        // Assert
        assertEquals(1, circle.getX());
        assertEquals(1, circle.getY());
        assertEquals(10, circle.getRadius());
    }

    @Test
    void getRectangle() {
        // Arrange
        CreateList createList = new CreateList();

        // Act
        Rectangle rectangle = createList.getRectangle();

        // Assert
        assertEquals(1, rectangle.getX());
        assertEquals(1, rectangle.getY());
        assertEquals(10, rectangle.getWidth());
        assertEquals(10, rectangle.getHeight());
    }

    @Test
    void getTriangle() {
        // Arrange
        CreateList createList = new CreateList();

        // Act
        Triangle triangle = createList.getTriangle();

        // Assert
        assertEquals(1, triangle.getX());
        assertEquals(1, triangle.getY());
        assertEquals(10, triangle.getSideLength());
    }
}