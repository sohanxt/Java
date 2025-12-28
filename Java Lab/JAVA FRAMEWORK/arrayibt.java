import java.util.ArrayList;
import java.util.Scanner;

public class arrayibt {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> cars = new ArrayList<>();
        cars.add(10);
        cars.add(22);
        cars.add(33);
        cars.add(55);
        cars.add(3, 22);

        System.out.println(cars.get(3));
        System.out.println(cars);

        ArrayList<String> carname = new ArrayList<>();
        carname.add("BMW");
        carname.add("CZAR");
        carname.add("Toyota");
          ArrayList<String> carname1 = new ArrayList<>();
        carname1.add("BMW 1");
        carname1.add("CZAR 2");
        carname1.add("Toyota 3");
System.out.println(carname);
        carname.addAll(carname1);
        
System.out.println(carname);
        

        sc.close();
    }
}
