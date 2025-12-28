import java.util.Scanner;
public class lab8assessment {
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("How input you want to give?");
        int n = sc.nextInt();

        int[] arr = new int[n];
        
        for(int i = 0 ; i < n;i++)
        {
           System.out.println("enter element "+ i +" :") ;
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int max = arr[0];
        int sum = 0;
        int count = 0;

        for(int i = 0 ;i<n;i++)
        {  
            if (arr[i] % 2 == 0 && arr[i] > 0)
            {
                sum = sum + arr[i];
                count++;
                if (min > arr[i])
                {
                    min = arr[i];
                }
                if (max < arr[i])
                {
                    max = arr[i];
                }
            }
        }

        double avg = (count == 0) ? 0 : (double)sum / (double)count;

        System.out.println("Max : " + max + "\nMin :"+min + "\n Average : "+avg);
        sc.close();
    }
}
