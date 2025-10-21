public class descendingsort {
    public static void main (String [] args)
    {

        int [] arr = { 3, 4 ,5 , 22, 88, 32, 5,8,11, 43,28};
     System.out.println("Before Sorting array :");
        for(int i = 0 ; i < arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println();

        for(int i = 0 ; i < arr.length - 1 ; i++)
        {
            for(int j = 0 ; j < arr.length-i-1;j++)
            {
               if (arr[j] < arr[j+1])
               {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
               }
            }
        }
    System.out.println("after Sorting array :");
        for(int i = 0 ; i < arr.length;i++)
        {
            System.out.print(" "+arr[i]);
        }
        System.out.println();


    }
    
}
