
abstract class Bird {
public abstract void eat();
}
class Sparrow extends Bird {
@Override
public void eat() {
System.out.println("Sparrow is eating");
}
public void fly() {
System.out.println("Sparrow is flying");
}
}
class Penguin extends Bird {
@Override
public void eat() {
System.out.println("Penguin is eating");
}
public void swim() {
System.out.println("Penguin is swimming");
}
}
public class LSP {

    public static void main (String [] args)
    {
     Bird sparrow = new Sparrow();
sparrow.eat(); // Output: Sparrow is eating
((Sparrow) sparrow).fly(); // Output: Sparrow is flying

Bird penguin = new Penguin();
penguin.eat(); // Output: Penguin is eating
((Penguin) penguin).swim(); // Output: Penguin is swimming  
    }

}
