import java.util.Scanner;

public class EvenPositiveStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask how many numbers will be entered
        int n = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        // Read n numbers
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();

            // Consider only even positive numbers
            if (num > 0 && num % 2 == 0) {
                if (num > max) max = num;
                if (num < min) min = num;
                sum += num;
                count++;
            }
        }

        // Output results
        if (count == 0) {
            System.out.println("Max: 0");
            System.out.println("Min: 0");
            System.out.println("Average: 0");
        } else {
            System.out.println("Max: " + max);
            System.out.println("Min: " + min);
            System.out.println("Average: " + (sum / count));
        }

        sc.close();
    }
}
