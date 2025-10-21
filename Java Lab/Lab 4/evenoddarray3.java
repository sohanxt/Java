import java.util.Scanner;
public class test3 {
    public static void main (String [] args)
{
    Scanner sc = new Scanner(System.in);


    System.out.println("Enter array size : ");
    int n = sc.nextInt();
    int[] arr = new int[n];
     int [] even = new int [n];
     int[] odd = new int[n];
     int evenindex = 0;
     int oddindex = 0;
    System.out.println("Enter array elements : ");
    for(int i = 0 ; i < n ; i++)
    {
        arr[i] = sc.nextInt();
    }
    sc.close();
System.out.println("printing array elements : ");

for(int i = 0 ; i < n ; i++)
    {
       System.out.print(" " +arr[i]);
    }
    System.out.println();

    for (int i = 0 ; i < n ; i++)
    {
        if (arr[i]%2 == 0)
        {
            even[evenindex] = arr[i];
            evenindex++;
        }
        else 
        {
            odd[oddindex] = arr[i];
            oddindex++;
        }
    }

    System.out.println("Printing even array :");
for(int i = 0 ; i < evenindex; i++)
    {
       System.out.print(" " +even[i]);
    }
    System.out.println();
  System.out.println("Printing odd array :");
for(int i = 0 ; i <oddindex ; i++)
    {
       System.out.print(" " +odd[i]);
    }
    System.out.println();
      

}    
}
