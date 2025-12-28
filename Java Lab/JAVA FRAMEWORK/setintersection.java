
import java.util.HashSet;
import java.util.Set;
public class setintersection {

    public static void main (String [] args)
    {
        Set<Integer> st1 = new HashSet<>();

        st1.add(100);
        st1.add(150);
        st1.add(200);
        st1.add(250);
        System.out.println(st1);

         Set<Integer> st2 = new HashSet<>();

        st2.add(300);
        st2.add(150);
        st2.add(200);
        st2.add(250);
        System.out.println(st2);

        st2.retainAll(st1);
        System.out.println("Intersecton : " +st2);





    }

}
