package adapters;

import drawing.IShape;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import shapes.Rectangle;

/**
 * This class adapter for the Rectangle
 *
 * @author Ted Ginn
 * @version 1.0
 */
public class RectangelAdapter implements IShape
{
    private Rectangle rectangle;

    /**
     * This is the constructor
     *
     * @param rectangle this is the object
     */
    public RectangelAdapter(Rectangle rectangle)
    {
        this.rectangle = rectangle;
    }

    @Override
    /**
     * This sets the thickness value for the rectangle
     */
    public IShape setThickness(double value)
    {
        return this;
    }

    @Override
    /**
     * This returns the color value
     */
    public IShape setColor(Color value)
    {
        return this;
    }

    @Override
    /**
     * This returns a filled boolean value
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
        return rectangle.getX();
    }

    @Override
    /**
     * This gets returns the y coodinate
     */
    public double getYCoordinate()
    {
        return rectangle.getY();
    }

    @Override
    /**
     * This returns the thickness value
     */
    public double getThickness()
    {
        return rectangle.getThickness();
    }

    @Override
    /**
     * This returns the color of the rectangle
     */
    public Color getColor()
    {
        return rectangle.getColor();
    }

    @Override
    /**
     * This gets whether the rectangle is filled or not
     */
    public boolean getFilled()
    {
        return false;
    }

    @Override
    public void drawShape(GraphicsContext graphics)
    {

    }
}
