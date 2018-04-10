/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

/**
 *
 * @author Khaled
 */
public class Triangle extends Boundries {

    public Triangle() {
    }

    public Triangle(int x1, int y1, int x2, int y2, int x3, int y3, int width, Color color,boolean fill) {
        super(x1, y1, x2, y2, x3, y3, width, color,fill);
    }
    public void move(int Xshift, int Yshift) {
        setX1(getX1() + Xshift);
        setY1(getY1() + Yshift);

        setX2(getX2() + Xshift);
        setY2(getY2() + Yshift);
         setX3(getX3() + Xshift);
        setY3(getY3() + Yshift);
    }
         public void resize(int Xshift, int Yshift) {
        setX1(getX1() + Xshift);
        setY1(getY1() + Yshift);
    }
  @Override
    public boolean containsPoint (int x1, int y1){
        Polygon p = new Polygon();
        p.addPoint(getX1(), getY1());
        p.addPoint(getX2(), getY2());
        p.addPoint(getX3(), getY3());
        if(p.contains(x1,y1)){
   return true;
    }
        return false;
    }
   
    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        Polygon p = new Polygon();
        p.addPoint(getX1(), getY1());
        p.addPoint(getX2(), getY2());
        p.addPoint(getX3(), getY3());
        if (getFill()) {
            g.fillPolygon(p);
        } else {
            g.drawPolygon(p);
        }
    }

}
