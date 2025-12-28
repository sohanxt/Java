import java.util.HashMap;
public class HASHMAPS{
public static void main(String[] args) {
HashMap<String, String> capitalCities = new HashMap<String, String>();
capitalCities.put("England", "London");
capitalCities.put("India", "New Dehli");
capitalCities.put("Austria", "Wien");

capitalCities.put("Norway", "Oslo");
capitalCities.put("Norway", "Oslo"); // Duplicate
capitalCities.put("USA", "Washington DC");



System.out.println(capitalCities);

System.out.println(capitalCities.get("England"));

capitalCities.remove("USA");
System.out.println(capitalCities);
capitalCities.size();
for (String i:capitalCities.keySet())
{
System.out.println(i);
    
}
for (String i : capitalCities.keySet()) {
System.out.println("key: " + i + " value: " + capitalCities.get(i));

}
}
}