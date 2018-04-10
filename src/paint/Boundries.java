package paint;

import java.awt.Color;
import java.awt.Graphics;

/**
 * This is an abstract class with an abstract draw method. It inherits from MyShape
 * and contains methods needed for drawing ovals and rectangles. It also contains an instance variable called fill.
 */
abstract class Boundries extends Shapes 
{
    private boolean fill; //boolean variable that determines whether the shape is filled or not
   
    /**
     * public constructor that takes no parameters and calls the no parameter constructor for Myshape.
     * It sets fill to false.
     */
    public Boundries()
    {
        super();
        fill=false;
    }
    
    /**
     * public overloaded constructor that takes int coordinates and a boolean for fill.
     * It passes the coordinates and color into the constructor for Myshape and assigns
     * the fill to an instance variable fill.
     */
    public Boundries(int x1, int y1, int x2, int y2, Color color,int width, boolean fill)
    {
        super(x1, y1, x2, y2, color,width);
        this.fill=fill;
    }

    public Boundries( int x1, int y1, int x2, int y2, int x3, int y3, int width, Color color,boolean fill) {
        super(x1, y1, x2, y2, x3, y3, width, color);
        this.fill = fill;
    }
   
    //Mutator methods
    
    /**
     * set fill
     */
    public void setFill(boolean fill)
    {
        this.fill=fill;
    }
    
    /**
     * gets the upper left x
     */
    public int getUpperLeftX()
    {
        return Math.min(getX1(),getX2());
    }
    public int[] getx(){
        int[] x={getUpperLeftX(),2};
        return x;
    }
    /**
     * gets the upper left y
     */
    public int getUpperLeftY()
    {
        return Math.min(getY1(),getY2());
    }
    
    /**
     * gets width
     */
    public int getWidth()
    {
        return Math.abs(getX1()-getX2());
    }
    
    //Accessor methods
    
    /**
     * gets height
     */
    public int getHeight()
    {
        return Math.abs(getY1()-getY2());
    }
    
    /**
     * return fill
     */
    public boolean getFill()
    {
        return fill;
    }
    
    /**
     * Abstract method for drawing the shape that must be overriden
     */
    abstract public void draw( Graphics g );
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

  
   abstract public boolean containsPoint(int x1, int y1);
public abstract void move(int Xshift, int Yshift);
public abstract void resize(int Xshift, int Yshift);
} // end class MyBoundedShape