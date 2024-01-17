

public class Shape
{
  private String color;
  private boolean filled;
  
  public Shape(String color, boolean filled){
      this.color = color;
      this.filled = filled;
  }
  
  public double calculateArea(){
      return 0;
  }
  
  public double calculatePerimeter(){
      return 0;
  }
  
  public void displayInfo(){
      System.out.println("Color: " + this.color);
      System.out.println("Is Filled: " + this.filled);
  }
  
  public String getColor(){
      return this.color;
  }
  
  public boolean getFill(){
      return this.filled;
  }
  
  public void setColor(String color){
      this.color = color;
  }
  
  public void setFill(boolean fill){
      this.filled = fill;
  }
}
