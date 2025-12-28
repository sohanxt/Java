import java.util.HashSet;
public class Main {
public static void main(String[] args) {
HashSet<String> cars = new HashSet<String>();
cars.add("Volvo");
cars.add("BMW");
cars.add("Ford");
cars.add("BMW"); // Duplicate
cars.add("Mazda");
cars.add("Mazda");
System.out.println(cars);


System.out.println("Does contain Mazda? \n" + (cars.contains("Ford")));

cars.remove("BMW");
System.out.println(cars);
cars.clear();
System.out.println(cars);
HashSet<String> cars1 = new HashSet<String>();
cars1.add("Volvo");
cars1.add("BMW");
cars1.add("Ford");
cars1.add("BMW1"); // Duplicate
cars1.add("Mazda");
cars1.add("Mazda1");
for (String i : cars1) {
System.out.println(i);
}


}
}