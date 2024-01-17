
/**
 * Write a description of class Driver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Driver
{
 public static void main(String args[]){   
 Shape[] s = new Shape[4];
 s[0] = new Circle(3,"blue", true);
 s[1] = new Rectangle(4,2,"blue",false);
 s[2] = new Triangle(1,2,4,"red",true);

 
 for(Shape shapes: s){
     System.out.println(shapes.calculatePerimeter());
     System.out.println(shapes.calculateArea());
 }
}
}
