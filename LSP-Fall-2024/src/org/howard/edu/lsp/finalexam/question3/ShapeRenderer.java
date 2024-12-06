package org.howard.edu.lsp.finalexam.question3;

/**
 * Class for rendering shapes using the Factory Pattern and Singleton design.
 */
public class ShapeRenderer {
    private static final ShapeFactory shapeFactory = ShapeFactory.getInstance();

    /**
     * Renders a shape based on the provided type.
     * @param shapeType the type of shape to render
     */
    public void renderShape(String shapeType) {
        Shape shape = shapeFactory.createShape(shapeType);
        if (shape != null) {
            shape.draw();
        } else {
            System.out.println("Unknown shape type: " + shapeType);
        }
    }

    public static void main(String[] args) {
        ShapeRenderer renderer = new ShapeRenderer();
        // Render various shapes
        renderer.renderShape("circle");    // Output: Drawing a Circle
        renderer.renderShape("rectangle"); // Output: Drawing a Rectangle
        renderer.renderShape("triangle");  // Output: Drawing a Triangle
        renderer.renderShape("hexagon");   // Output: Unknown shape type: hexagon
    }
}

/**
 * Interface for shapes that can be drawn.
 */
interface Shape {
    void draw();
}

/**
 * Circle class that implements the Shape interface.
 */
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

/**
 * Rectangle class that implements the Shape interface.
 */
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

/**
 * Triangle class that implements the Shape interface.
 */
class Triangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}

/**
 * Singleton factory class for creating Shape instances.
 */
class ShapeFactory {
    private static ShapeFactory instance;

    private ShapeFactory() {}

    /**
     * Gets the single instance of the ShapeFactory.
     * @return the singleton instance of ShapeFactory
     */
    public static ShapeFactory getInstance() {
        if (instance == null) {
            instance = new ShapeFactory();
        }
        return instance;
    }

    /**
     * @param shapeType the type of shape to create
     * @return the Shape instance or null if the type is not known
     */
    public Shape createShape(String shapeType) {
        switch (shapeType.toLowerCase()) {
            case "circle": return new Circle();
            case "rectangle": return new Rectangle();
            case "triangle": return new Triangle();
            default: return null;
        }
    }
}
