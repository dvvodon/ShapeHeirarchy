
/**
 * Write a description of class Triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Triangle extends Shape {
 private double side1, side2, side3;
 public Triangle(double side1, double side2, double side3, String color, boolean filled){
     super(color, filled);
     this.side1 = side1;
     this.side2 = side2;
     this.side3 = side3;
 }
    
 public double getSide1(){
     return this.side1;
 }
 
  public double getSide2(){
     return this.side2;
 }
 
  public double getSide3(){
     return this.side3;
 }
 
 public void setSide1(double side1){
     this.side1 = side1;
 }
 
 public void setSide2(double side2){
     this.side2 = side2;
 }
 
 public void setSide3(double side3){
     this.side3 = side3;
 }
 
 public double calaculatePerimeter(){
     return (side1 + side2 + side3);
 }
 
 public double calculateArea(){
     double s = (this.calculatePerimeter())/2;
     return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
 }
}
