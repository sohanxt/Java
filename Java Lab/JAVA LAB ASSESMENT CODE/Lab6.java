

 class Account
          {
    protected double balance = 0;
    public void deposit (double amount)
    {
        balance = balance + amount;
        System.out.println("New Balance is "+balance);
    }
}

class SavingAccount extends Account
        {
    public void calculateInterest (double rate)
    {
        double interest = (balance*rate)/100;
        System.out.println("Interest on following balance " +interest);
    }
}
public class Lab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       {
        SavingAccount ac = new SavingAccount();
        ac.deposit(1000.0);
        ac.calculateInterest(10.15);

        
    }
    }
    
}
