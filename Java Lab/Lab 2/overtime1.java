import java.util.Scanner;

public class overtime1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee's working hours: ");
        double workhour = sc.nextDouble();

        double standardwork = 40;
        double hourlyRate = 8.25D;
        double standardpay = standardwork * hourlyRate;
        double overtimeRate = hourlyRate * 1.5D;

        if (workhour >= standardwork) {
           double extrahour = workhour - standardwork;
            double finalpay = standardpay + (extrahour * overtimeRate);
            System.out.println("Final payment with overtime is: $" + finalpay);
        } else {
            double finalpay = workhour * hourlyRate;
            System.out.println("No overtime. Final payment is: $" + finalpay);
        }

        sc.close();
    }
}
