package adapters;

import drawing.IShape;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import shapes.Circle;
import shapes.Line;
import shapes.Shape;

/**
 * This class is the adapter for the line class
 *
 * @author Ted Ginn
 * @version 1.0
 */
public class LineAdapter implements IShape
{
    private Line line;

    /**
     * This is the constructor for the adapter
     *
     * @param line This holds the line object
     */
    public LineAdapter(Line line)
    {
        this.line = line;
    }

    @Override
    /**
     * This returns the value of the thickness for the line
     */
    public IShape setThickness(double value)
    {
        return this;
    }

    @Override
    /**
     * This retuens the color value for the line
     */
    public IShape setColor(Color value)
    {
        return this;
    }

    @Override
    /**
     * This returns the value of the filled line
     */
    public IShape setFilled(boolean value)
    {
        return this;
    }

    @Override
    /**
     * This gets the x coordinate for the line
     */
    public double getXCoordinate()
    {
        return line.getX();
    }

    @Override
    /**
     * This gets the y coordinate for the line
     */
    public double getYCoordinate()
    {
        return line.getY();
    }

    @Override
    /**
     * This returns the thickness of the line
     */
    public double getThickness()
    {
        return line.getThickness();
    }

    @Override
    /**
     * This gets the color for the line
     */
    public Color getColor()
    {
        return line.getColor();
    }

    @Override
    /**
     * This returns a boolean value false
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
