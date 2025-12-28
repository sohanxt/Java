import java.util.HashMap;
public class hashmaptry {

    public static void main (String [] args)
    {
        
HashMap<Integer ,String> Id = new HashMap<>();
Id.put(1098,"SOHAN");
Id.put(1082,"MITHILA");
Id.put(1102,"RIJOM");
Id.put(1002,"ABDULLAH");

System.out.println(Id);
System.out.println(Id.get(1082));
for (int i: Id.keySet())
{
    System.out.println(i);   
    }


Id.remove(1002);
System.out.println(Id);

for(int i : Id.keySet())
{
    System.out.println("ID " +i+ " Name "+Id.get(i));
}
Id.clear();
System.out.println(Id);
    }
}