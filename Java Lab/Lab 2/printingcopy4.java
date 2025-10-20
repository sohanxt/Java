import java.util.Scanner;
public class printingcopy4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of copies to print: ");
        int copies = sc.nextInt();

        double pricePerCopy;

        if (copies <= 99)
            pricePerCopy = 0.30;
        else if (copies <= 499)
            pricePerCopy = 0.28;
        else if (copies <= 799)
            pricePerCopy = 0.27;
        else if (copies <= 1000)
            pricePerCopy = 0.26;
        else
            pricePerCopy = 0.25;

        double totalPrice = copies * pricePerCopy;

        System.out.println("Price per copy: $" + pricePerCopy);
        System.out.println("Total price: $" + totalPrice);

        sc.close();
    }
}
