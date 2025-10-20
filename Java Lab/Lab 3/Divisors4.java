import java.util.Scanner;
public class Divisors4 {
    public static void main (String [] args)
    {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter a to check divisors :");
 int n = sc.nextInt();
 int count = 0;
 System.out.println("Output :");
 for(int i = 1; i <= n ; i++)
 {
    if (n%i==0)
    {
        System.out.println(i);
        count++;

    }
 }
 System.out.println("Total Divisors :"+count);
 sc.close();
    }
    
}
