/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pogriban.ex16;

/**
 *
 * @author ThinkPad
 */
public class Point {
private double x;
private double y;
public double getX() { return x; }
public double getY() { return y; }
public void setX(double x) { this.x = x; }
public void setY(double y) { this.y = y; }
public Point(double x, double y) {
setX(x);
setY(y);
}
public Point(double n) {
this(n, n);
}

public Point() {
this(0, 0);
}
public void display() {
System.out.println(this);
}
public String toString() {
return ("< " + getX() + " ; " + getY() + " >");
}
}
