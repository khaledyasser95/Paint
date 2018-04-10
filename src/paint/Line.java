package paint;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;

/**
 * This class inherits from MyShape and is responsible for drawing a line.
 */
public class Line extends Shapes
{  
    /**
     * No parameter constructor which calls the no parameter constructor in MyShape
     */
    
    public Line()
    {
       // super();
    }
    
    /** 
     * Overloaded constructor that takes coordinates and color. It passes them to the constructor in MyShape
     */
    public Line( int x1, int y1, int x2, int y2, Color color,int width )
    {
        super(x1, y1, x2, y2, color,width);
    } 
    
    @Override
     public boolean containsPoint(int x1, int y1) {
        Line2D line = new Line2D.Float(getX1(),getY1(), getX2(),getY2());
        double d = line.ptLineDist(x1, y1);
        if (d <= 1) {
            return true;

        }
        return false;
    }
    /**
     * Overrides the draw method in Myshape. It sets the gets the color from Myshape
     * and the coordinates it needs to draw from MyShape as well.
     */
//     @Override
//    public boolean containsPoint(int x1,int y1) {
//        Line2D line = new Line2D.Float(getX1(), getY1(),getX2(),getY2());
//        double d = line.ptLineDist(x1,y1);
//        if (d <= 1) {
//            return true;
//        }
//        return false;
//    }
     public void resize(int Xshift, int Yshift) {
        setX1(getX1() + Xshift);
        setY1(getY1() + Yshift);
    }
public void move(int Xshift, int Yshift) {
        setX1(getX1() + Xshift);
        setY1(getY1() + Yshift);

        setX2(getX2() + Xshift);
        setY2(getY2() + Yshift);
    }
    @Override
public void draw( Graphics g )
    {
         Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(getWidthh()));
        g.setColor( getColor() ); //sets the color
        g.drawLine( getX1(), getY1(), getX2(), getY2() ); //draws the line
        if (isSelected()) {
                    g.drawRect(getX1() - 5, getY1() - 5, 10, 10);
                    g.drawRect(getX2() - 5, getY2() - 5, 10, 10);
                }
    }
        
    
    
} // end class MyLine