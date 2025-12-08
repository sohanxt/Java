
public interface Figure {
    void getArea();
}

class Rectangle implements Figure {
    double width, height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void getArea() {
        double result = width * height;
        System.out.println("Area of Rectangle: " + result);
    }
}

class Circle implements Figure {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public void getArea() {
        double result = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
}

class FigureDemo {
    public static void main(String[] args) {
        Figure f1 = new Rectangle(10, 5);
        Figure f2 = new Circle(7);

        f1.getArea();
        f2.getArea();
    }
}
