package paint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 * This class inherits from MyBoundedShape and is responsible for drawing a
 * rectangle
 */
public class Square extends Boundries {

    /**
     * No parameter constructor which calls the no parameter constructor in
     * MyBoundedShape
     */
    public Square() {
        super();
    }

    public void resize(int Xshift, int Yshift) {
        setRadius(getRadius() + Xshift);
    }

    public void move(int Xshift, int Yshift) {
        setX1(getX1() + Xshift);
        setY1(getY1() + Yshift);

        setX2(getX2() + Xshift);
        setY2(getY2() + Yshift);
    }

    /**
     * Overloaded constructor that takes coordinates, color and fill. It passes
     * them into MyBoundedShape's constructor
     */
    public Square(int x1, int y1, int x2, int y2, Color color, int width, boolean fill) {
        super(x1, y1, x2, y2, color, width, fill);
    }

    @Override
    public boolean containsPoint(int x1, int y1) {
        Rectangle2D r = new Rectangle2D.Float(getX1(), getY1(), getRadius(), getRadius());
        if (r.contains(x1, y1)) {
            return true;
        }
        return false;
    }

    /**
     * Overrides the draw method in MyBoundedShape. It sets the gets the color
     * from MyBoundedShape to set the color and the values it needs to draw from
     * MyBoundedShape as well.
     */
    @Override
    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(getWidthh()));
        g.setColor(getColor()); //sets the color
        if (getFill()) //determines whether fill is true or false
        {
            g.fillRect(getUpperLeftX(), getUpperLeftY(), getRadius(), getRadius()); //draws a filled square
        } else {
            g.drawRect(getUpperLeftX(), getUpperLeftY(), getRadius(), getRadius()); //draws a regular sqaure
        }
        if (isSelected()) {
            g.drawRect(getX1() - 5, getY1() - 5, 10, 10);
            g.drawRect(getX1() + getRadius() - 5, getY1() - 5, 10, 10);
            g.drawRect(getX1() - 5, getY1() + getRadius() - 5, 10, 10);
            g.drawRect(getX1() + getRadius() - 5, getY1() + getRadius() - 5, 10, 10);
        }
    }

}
