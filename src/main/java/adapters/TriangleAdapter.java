package adapters;

import drawing.IShape;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.TriangleMesh;
import shapes.Triangle;

/**
 * This is the adapter class for the Triangle
 *
 * @author Ted Ginn
 * @version 1.0
 */
public class TriangleAdapter implements IShape
{
    private Triangle triangle;

    /**
     * This is the adapter class for the triangle
     *
     * @param triangle is the object
     */
    public TriangleAdapter(Triangle triangle)
    {
        this.triangle = triangle;
    }

    @Override
    /**
     * This returns the thickness value for the triangle
     */
    public IShape setThickness(double value)
    {
        return this;
    }

    @Override
    /**
     * This returns the set color value
     */
    public IShape setColor(Color value)
    {
        return this;
    }

    @Override
    /**
     * This returns the filled value for the triangle
     */
    public IShape setFilled(boolean value)
    {
        return this;
    }

    @Override
    /**
     * This returns the x coordinate
     */
    public double getXCoordinate()
    {
        return triangle.getX();
    }

    @Override
    /**
     * This returns the y coodinate
     */
    public double getYCoordinate()
    {
        return triangle.getY();
    }

    @Override
    /**
     * This gets the thickness
     */
    public double getThickness()
    {
        return triangle.getThickness();
    }

    @Override
    /**
     * This gets the color for the triangle
     */
    public Color getColor()
    {
        return triangle.getColor();
    }

    @Override
    /**
     * This gets the filled value
     */
    public boolean getFilled()
    {
        return false;
    }

    @Override
    /**
     *
     */
    public void drawShape(GraphicsContext graphics)
    {

    }
}
