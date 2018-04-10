/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Khaled
 */
abstract class Shapes implements Cloneable{
    

    private int x1, y1, x2, y2, x3, y3, width; //coordinates of shape
 private int radius;
  protected boolean selected;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public boolean isSelected() {
        return selected;
    }

    public int getRadius() {
        return radius;
    }
   
    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidthh() {
        return width;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public int getX3() {
        return x3;
    }

    public int getY3() {
        return y3;
    }

    public int getWidth() {
        return width;
    }
    private Color color; // color of shape

    public Shapes() {
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0;
        x3 = 0;
        y3 = 0;
        color = Color.BLACK;

    }
     public Shapes(int x1, int y1, Color color, int width) {
        this.x1 = x1;
        this.y1 = y1;
        
        this.color = color;
        this.width = width;
     }

    public Shapes(int x1, int y1, int x2, int y2, Color color, int width) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
        this.width = width;

    }

    public Shapes(int x1, int y1, int x2, int y2, int x3, int y3, int width, Color color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.width = width;
        this.color = color;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX2() {
        return x2;
    }

    public int getY2() {
        return y2;
    }

    public Color getColor() {
        return color;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    abstract public void draw(Graphics g);
@Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

   abstract public boolean containsPoint(int x1, int y1);
   public abstract void move(int Xshift, int Yshift);
    public abstract void resize(int Xshift, int Yshift);
}
