import java.util.Scanner;
public class tax5 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your income: ");
        double income = sc.nextDouble();

        double tax = 0;

        if (age < 18) {
            tax = 0;
        } else if (income < 10000) {
            tax = 0;
        } else if (income <= 20000) {
            tax = income * 0.05;
        } else {
            tax = income * 0.10;
        }

        System.out.println("Your tax amount is: $" + tax);
        sc.close();
    }
}
