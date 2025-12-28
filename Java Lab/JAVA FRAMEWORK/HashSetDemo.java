import java.util.*;

public class HashSetDemo {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        set1.add("Welcome");
        set1.add("To");
        set1.add("Geeks");
        set1.add("4");
        set1.add("Geeks"); // duplicate ignored

        System.out.println("Set1: " + set1);

        System.out.println("Does the Set contain 'Geeks'? " + set1.contains("Geeks"));
        System.out.println("Does the Set contain '4'? " + set1.contains("4"));
        System.out.println("Does the Set contain 'No'? " + set1.contains("No"));

        Set<String> set2 = new HashSet<>();
        set2.add("Geeks");
        set2.add("4");

        // Intersection
        set2.retainAll(set1);
        System.out.println("Intersection is: " + set2);

        // Subset check
        System.out.println("set1 contains all of set2? " + set1.containsAll(set2));
    }
}
