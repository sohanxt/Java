import java.util.HashSet;
import java.util.Set;
public class hashin {

    public static void main (String [] args)
    {
        Set<Integer> numst = new HashSet<Integer>();
        numst.add(8);
        numst.add(9);
        numst.add(7);

        for (int i= 1 ;i <=10;i++)
        {
            if(numst.contains(i))
            {
                System.out.println(i + " was found in set");
            }
            else
            {
                System.out.println(i + " was not found in set");

            }
        }

    }

}
