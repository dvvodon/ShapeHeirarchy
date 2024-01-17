
/**
 * Write a description of class rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape{
    private double width, height;
    
    public Rectangle(double width, double height, String color, boolean filled){
        super(color, filled);
        this.height = height;
        this.width = width;
    }
    
    public double getHeight(){
        return this.height;
    } 
    
    public double getWidth(){
        return this.width;
    } 
    
    public void setHeight(double height){
    this.height = height;
    }       
    
    public void setWidth(double width){
    this.width = width;
    }
    
    public double calculateArea(){
       return (this.width*this.height);
     }
    
    public double calculatePerimeter(){
        return ((2*(this.width)) + (2*(this.height)));
    }
    
    
} 
