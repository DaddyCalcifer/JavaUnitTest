package bois.chernichkin.javatesttask.Logic;

import bois.chernichkin.javatesttask.Model.Circle;
import bois.chernichkin.javatesttask.Model.Rectangle;
import bois.chernichkin.javatesttask.Model.Triangle;

public class CreateListSelfTest {
    public void fillListTest() {
        CreateList createList = new CreateList();
        int expectedSize = 3;

        if (!(createList.getCircle() instanceof Circle)) {
            System.out.println("❌ fillListTest:\t\tFAILED");
            return;
        }
        if (!(createList.getRectangle() instanceof Rectangle)) {
            System.out.println("❌ fillListTest:\t\tFAILED");
            return;
        }
        if (!(createList.getTriangle() instanceof Triangle)) {
            System.out.println("❌ fillListTest:\t\tFAILED");
            return;
        }
        System.out.println("✅ fillListTest:\t\tPASSED");
    }

    public void getListTest() {
        CreateList createList = new CreateList();
        int expectedSize = 3;
        int actualSize = createList.getList().size();

        if (actualSize == expectedSize) {
            System.out.println("✅ getListTest:\t\t\tPASSED");
        } else {
            System.out.println("❌ getListTest:\t\t\tFAILED");
        }
    }

    public void getCircleTest() {
        CreateList createList = new CreateList();
        Circle circle = createList.getCircle();

        if (circle.getX() == 1 && circle.getY() == 1 && circle.getRadius() == 10) {
            System.out.println("✅ getCircleTest:\t\tPASSED");
        } else {
            System.out.println("❌ getCircleTest:\t\tFAILED");
        }
    }

    public void getRectangleTest() {
        CreateList createList = new CreateList();
        Rectangle rectangle = createList.getRectangle();

        if (rectangle.getX() == 1 && rectangle.getY() == 1 && rectangle.getWidth() == 10 && rectangle.getHeight() == 10) {
            System.out.println("✅ getRectangleTest:\tPASSED");
        } else {
            System.out.println("❌ getRectangleTest:\tFAILED");
        }
    }

    public void getTriangleTest() {
        CreateList createList = new CreateList();
        Triangle triangle = createList.getTriangle();

        if (triangle.getX() == 1 && triangle.getY() == 1 && triangle.getSideLength() == 10) {
            System.out.println("✅ getTriangleTest:\t\tPASSED");
        } else {
            System.out.println("❌ getTriangleTest:\t\tFAILED");
        }
    }
}
