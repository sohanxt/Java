import java.util.ArrayList;
import java.util.Scanner;
public class arraylist {

    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);

ArrayList<String> cars = new ArrayList<String>();
cars.add("Volvo");
cars.add("BMW");
cars.add("Ford");
cars.add(0, "Mazda");
cars.add(3,"Toyota");
System.out.println(cars);




        sc.close();
    }

}
