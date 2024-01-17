
public class Pentagon extends Shape
{
  private double side;
  
  public Pentagon(double side, String color, boolean filled){
      super(color, filled);
      this.side = side;
  }
  
  public void setSide(double side){
      this.side = side;
  }
   
  public double getSide(){
      return this.side;
  }
  
  @Override
  public double calculateArea(){
      return ((.25*(Math.sqrt(5*(5+(2*Math.sqrt(5))))))*this.side*this.side);
  }
}
