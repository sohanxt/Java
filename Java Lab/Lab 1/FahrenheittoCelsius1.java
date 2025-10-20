import java.util.Scanner;
public class FahrenheittoCelsius1 {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter temperature in fahrenteit :");
      double fahrenheit = sc.nextDouble();
      double celsius =  ((fahrenheit-32)*(5.0/9.0));
      System.out.println("Fahrenheit to Celsius Value = "+celsius);
      sc.close();
    }
    
}
