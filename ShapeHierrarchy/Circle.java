
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Shape
{
private double radius;

public Circle(double radius,String color,boolean filled){
    super(color,filled);
    this.radius = radius;
}

public double getRadius(){
    return this.radius;
}

public void setRadius(double radius){
    this.radius = radius;
}

public double calculateArea(){
    return ((this.radius)*(Math.PI)*(Math.PI));
}

public double calculatePerimeter(){
    return ((2*(this.radius)) * Math.PI);
}
   
}
