
/**
 * Write a description of class House here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class House extends Shape{
    private Triangle top;
    private Square base;
    
    public House(Triangle a, Square b, String color, boolean filled){
        super(color,filled);
        this.top.equals(a);
        this.base.equals(b);
    }
    
    public void setSquareSide(double side){
        base.setSide(side);
    }
    
    public void setTriangleSide1(double side){
        top.setSide1(side);
    }
    
    public void setTriangleSide2(double side){
        top.setSide2(side);
    }

    public void setTriangleSide3(double side){
        top.setSide3(side);
    }
    
    public double getSquareSide(){
       return base.getSide();
    }
    
    public double getTriangleSide1(){
        return top.getSide1();
    }
    
    public double getTriangleSide2(){
        return top.getSide2();
    }
    
    public double getTriangleSide3(){
        return top.getSide3();
    }
    
    @Override
    public double calculateArea(){
        return (top.calculateArea() + base.calculateArea());
    }
    
    @Override
    public double calculatePerimeter(){
        return ((3*base.getSide()) + top.getSide1() + top.getSide2());
    }
}
