package adapters;

import drawing.IShape;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.TriangleMesh;

public class TriangleAdapter implements IShape
{
    private TriangleMesh triangle;

    public TriangleAdapter(TriangleMesh triangle)
    {
        this.triangle = triangle;
    }

    @Override
    public IShape setThickness(double value)
    {
        return null;
    }

    @Override
    public IShape setColor(Color value)
    {
        return null;
    }

    @Override
    public IShape setFilled(boolean value)
    {
        return null;
    }

    @Override
    public double getXCoordinate()
    {
        return 0;
    }

    @Override
    public double getYCoordinate()
    {
        return 0;
    }

    @Override
    public double getThickness()
    {
        return 0;
    }

    @Override
    public Color getColor()
    {
        return null;
    }

    @Override
    public boolean getFilled()
    {
        return false;
    }

    @Override
    public void drawShape(GraphicsContext graphics)
    {

    }
}