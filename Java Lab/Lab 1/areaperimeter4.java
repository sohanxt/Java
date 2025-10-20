import java.util.Scanner;

public class areaperimeter4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Rectangle
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = sc.nextDouble();

        double rectangleArea = length * width;
        double rectanglePerimeter = 2 * (length + width);

        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Rectangle Perimeter: " + rectanglePerimeter);

        // Circle
        System.out.print("\nEnter radius of circle: ");
        double radius = sc.nextDouble();

        double circleArea = Math.PI * radius * radius;
        double circlePerimeter = 2 * Math.PI * radius;

        System.out.println("Circle Area: " + circleArea);
        System.out.println("Circle Perimeter: " + circlePerimeter);

     sc.close();
    }
}
