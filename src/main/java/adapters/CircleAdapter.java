package adapters;

import drawing.IShape;
import drawing.SavedShapes;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import shapes.Circle;
import shapes.Shape;

public class CircleAdapter implements IShape
{
    private Circle circle;


    /**
     * This is the constructor
     *
     * @param circle this is the circle object
     */
    public CircleAdapter(Circle circle)
    {
        this.circle = circle;
    }

    @Override
    /**
     * This returns the value for thickness of the circle
     */
    public IShape setThickness(double value)
    {
        return this;
    }

    @Override
    /**
     * This returns the color value of the circle
     */
    public IShape setColor(Color value)
    {
        return this;
    }

    @Override
    /**
     * This returns the walue for filled of the circle
     */
    public IShape setFilled(boolean value)
    {
        return this;
    }

    @Override
    /**
     * This returns the x coordinate the circle
     */
    public double getXCoordinate()
    {
        return circle.getX();
    }

    @Override
    /**
     * This returns the y coordinate for the circle
     */
    public double getYCoordinate()
    {
        return circle.getY();
    }

    @Override
    /**
     * This returns the thickness of the circle
     */
    public double getThickness()
    {
        return circle.getThickness();
    }

    @Override
    /**
     * This returns the color of the circle
     */
    public Color getColor()
    {
        return circle.getColor();
    }

    @Override
    /**
     * This returns if the cicle is filled or not
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
