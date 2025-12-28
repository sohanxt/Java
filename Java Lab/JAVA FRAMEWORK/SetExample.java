import java.util.HashSet;
import java.util.Set;
public class SetExample {
public static void main(String[] args) {

Set<Integer> set1 = new HashSet<>();

set1.add(200);
set1.add(300);
System.out.println(set1);

Set<Integer> set2 = new HashSet<>();

set2.add(100);
set2.add(200);
System.out.println( set2);
// Union of two sets

set2.addAll(set1);
System.out.println("Union is: " + set2);
}
}