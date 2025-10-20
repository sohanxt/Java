import java.util.Scanner;
public class movieticket2 {
    public static void main ( String [] args)

    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age :");
        int age = sc.nextInt();
         System.out.println("is it weeknd enter true or false :");
         boolean weekend = sc.nextBoolean();
         int ticketprice = 0;
         if (weekend)
         {
            if(age < 13)
            {
                ticketprice = 120;
            }
            else if (age <= 64)
            {
                ticketprice = 180;
            }
            else
            {
                ticketprice = 150;
            }
         }
         else
         {
           if(age < 13)
            {
                ticketprice = 100;
            }
            else if (age <= 64)
            {
                ticketprice = 150;
            }
            else
            {
                ticketprice = 130;
            }
         }

         System.out.println("Ticket price is : " +ticketprice);
sc.close();
    }
}
