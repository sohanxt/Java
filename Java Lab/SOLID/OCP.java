import java.lang.Math;
//Step 1: Define the Shape Interface
interface Shape {
double calculateArea();
}
//Step 2: Implement Specific Shape Classes
class Circle implements Shape {
private double radius;
public Circle(double radius) {
this.radius = radius;
}
@Override
public double calculateArea() {
return Math.PI * radius * radius;
}}

class Rectangle implements Shape {
private double width;
private double height;

public Rectangle(double width, double height) {
this.width = width;
this.height = height;
}
@Override
public double calculateArea() {
return width * height;
}
}

//Step 3: Update the AreaCalculator Class
class AreaCalculator {
public double calculateArea(Shape shape) {
return shape.calculateArea();
}
}
public class OCP {

    public static void main (String [] args)
    {
        
Shape circle = new Circle(5);
Shape rectangle = new Rectangle(4, 5);
AreaCalculator calculator = new AreaCalculator();
System.out.println("Circle area: " + calculator.calculateArea(circle));
System.out.println("Rectangle area: " +calculator.calculateArea(rectangle));
    }

}
