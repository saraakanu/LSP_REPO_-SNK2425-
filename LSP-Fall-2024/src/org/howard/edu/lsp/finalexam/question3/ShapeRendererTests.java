package org.howard.edu.lsp.finalexam.question3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * Unit tests for the ShapeRenderer class and ShapeFactory.
 */
public class ShapeRendererTests {

    @Test
    public void testCircleCreation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape circle = factory.createShape("circle");
        assertNotNull(circle, "Circle should be created successfully");
    }

    @Test
    public void testRectangleCreation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape rectangle = factory.createShape("rectangle");
        assertNotNull(rectangle, "Rectangle should be created successfully");
    }

    @Test
    public void testTriangleCreation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape triangle = factory.createShape("triangle");
        assertNotNull(triangle, "Triangle should be created successfully");
    }

    @Test
    public void testUnknownShapeCreation() {
        ShapeFactory factory = ShapeFactory.getInstance();
        Shape unknown = factory.createShape("hexagon");
        assertNull(unknown, "Unknown shape type should return null");
    }
}

