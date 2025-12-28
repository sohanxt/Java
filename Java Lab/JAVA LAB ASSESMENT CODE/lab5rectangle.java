import java.util.Scanner;
    class Rectangle {
    private int length;
    private int width;

    public void input() {
       Scanner Sc = new Scanner(System.in);
       System.out.println("Enter Length : ");
       length = Sc.nextInt();
       System.out.println("Enter Width : ");
       width = Sc.nextInt();
    }

    public int calculateArea() {
        return length * width;
    }

    public void display() {
        int area = calculateArea();
        System.out.println("Here area of rectangle = " + area);
    }
}

public class lab5rectangle {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.input();
        rec.display();
      
       
    }

}

    

