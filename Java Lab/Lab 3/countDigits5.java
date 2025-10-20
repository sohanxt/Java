import java.util.Scanner;
public class countDigits5 {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();
        int count = 0;
        int temp = n;
        while(n>0)
        {
            n = n/10;
            count++;
        }

        System.out.println("Total Digits in "+temp+ " is "+count);
    sc.close();
}
    
}
