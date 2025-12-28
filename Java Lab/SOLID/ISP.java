interface Workable {

void work();

}

interface Eatable {

void eat();

}

class Human implements Workable, Eatable {

public void work() {

System.out.println("Human is working.");

}

public void eat() {

System.out.println("Human is eating.");

}

}

class Robot implements Workable {

public void work() {

System.out.println("Robot is working.");

}

}
public class ISP {

    public static void main (String [] args)
    {
        

  Human h1 = new Human();

  Robot r1 = new Robot();

  h1.eat();
  h1.work();
  r1.work();
  




   
    }

}
